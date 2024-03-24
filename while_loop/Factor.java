import java.util.Scanner;
class Factor
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();

		for(int i=1;i<=num;i++)
		{
			if(num %i==0){
				System.out.println(i+" ");
			}
		}
		
	}
}