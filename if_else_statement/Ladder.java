import java.util.Scanner;
class Ladder
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a percentage:");
		double percentage = sc.nextDouble();

		if(percentage<35)
		{
			System.out.println("You have failed in your life");

		}
		else if (percentage<60)
		{
			System.out.println(" You have cleared exam any how");
			System.out.println("Grade B second class");
		}
		else if(percentage<75)
		{
			System.out.println("you done a little hard work");
			System.out.println("Grade A+ Distinction");

		}
		else if(percentage<=100)
		{
			System.out.println("Miracle");
			System.out.println("Grade O first class with distiction");
		}
		else 
		{
			System.out.println("Invalid percentagr u don't belongs to this planet");
		}
	}
}