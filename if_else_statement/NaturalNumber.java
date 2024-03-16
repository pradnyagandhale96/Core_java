import java.util.Scanner;
class NaturalNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		double number = sc.nextDouble();

		if(number>0){
			System.out.println("The Number is positive");
		}
		else if (number <0)
		{
			System.out.println("The Number is negative");
		}
		else
		{
			System.out.println("Number is zero");
		}


	}
}