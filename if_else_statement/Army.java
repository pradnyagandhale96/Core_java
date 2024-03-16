import java.util.Scanner;
class Army
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		if(age<18)
		{
			System.out.print("you are a kid  join after"+(18-age) +"years");
		}
		else 
		{
			System.out.println("Enter your height");
			double height = sc.nextDouble();
		    if(height>=162)
		{
			System.out.println("Enter your weight");
		    double weight = sc.nextDouble();
		    if(weight>56)
		    {
		    	System.out.println("you are able to join army");
		    }
		    else 
		    {
		    	System.out.println("you are not able to join army");
		    }
		} 
		   else
		  {
			System.out.println("go to home and drink complan");
		}
	}
}

}