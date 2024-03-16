import java.util.Scanner;
class Employee
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Target score:");
		int targetScore = sc.nextInt();

		if(targetScore>90)
		{
			System.out.println("Increase the pay of employee by 3%: ");

		}
		else 
		{
			System.out.println("Increase the pay of employee by 1%:");
		}

	}
}