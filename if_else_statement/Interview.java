import java.util.Scanner;
class Interview
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Percentage");
		double percentage = sc.nextDouble();

		if(percentage>60)
		{
			System.out.println("Student is eligibal");
		}
		else
		{
			System.out.println("Student is not eligibal");
		}
	}
}