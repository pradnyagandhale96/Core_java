import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int length=0;
		int dup=num;
		int dup1=num;
		int sum=0;

		while(num!=0)
		{
			length++;
		}
		while(dup>0)
		{
			int rem=dup%10;
			int power=1;

			for(int i=1;i<=length;i++)
			{
				power=power*rem;
			}
			sum+=power;
			dup1=10;
		}
		if(sum==dup1)
		{
			System.out.println("ARMSTRONG");
		}
		else 
		{
			System.out.println("NOT ARMSTRONG");
		}
	}
}