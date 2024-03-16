import java.util.Scanner;
class CalculateTip
{
  public static void main(String[]args)
{ 
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your sub total bill:");
  double subTotal=sc.nextDouble();
  System.out.print("Enter the tip rate:"); 
  double tipRate=sc.nextDouble();

  double total= subTotal + tipRate*(subTotal/100);
  System.out.println("Sub total is " + subTotal+" and the tipRate is "+tipRate+"so the total bill is" +total);
 
 System.out.println("thank u visit again");
}
}