import java.util.Scanner;
class TableProgram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.print(num+"*" +i+"="+(num*i));
		}
	}
}