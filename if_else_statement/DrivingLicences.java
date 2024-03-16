import java.util.Scanner;
class DrivingLicences
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age");
		int age = sc.nextInt();

		if(age<18)
		{
			System.out.println("you are not eligibal try after"+(18-age) +"years");
        }
        else 
        {
        	System.out.println("have you passed the RTO test with more than 60 marks(yes/no):");
        	String pass = sc.next();

        	if(pass.equals("yes"))
        	{
        		System.out.println("You are eligibal for driving license");
        	}
        	
        		else 
        		{
        			System.out.println("re-appered for the test again");
        		}
        	}
        }
	}	

        

			
		
		

		
