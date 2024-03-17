import java.util.Scanner;
class FeetMeter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feetValue=sc.nextDouble();
		double meter=feetValue*0.305;
		System.out.println("feetValue is :"+feetValue+ "feet is Equal to: "+meter+"Meters.");                                          

		
	}
}