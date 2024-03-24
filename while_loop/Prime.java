import java.util.Scanner;
class Prime
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int count = 0;

		for (int i=2;i<=num;i++)
		{
			if (num%i==0)
			{
				count++;
				break;
			}
		}
		if (count==0)
		{
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}