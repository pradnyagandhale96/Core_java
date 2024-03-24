import java.util.Scanner;
class Palindrom
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		System.out.println((dup==rev)?"Palindrom Number":"not a Palindrom Number");
	}
}