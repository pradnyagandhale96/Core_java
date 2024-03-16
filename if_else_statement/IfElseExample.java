import java.util.Scanner;
class IfElseExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter age:");
		int age = sc.nextInt();

		System.out.println("Enter Property:");
		double property = sc.nextLong();

		System.out.print("Enter Surname:");
		String surname = sc.next().toUpperCase();

		if ((age>=21 && property>=10000000||surname.equals("AMBANI")))
        {
        	System.out.println("you are eligibal");

        }
        else{
            System.out.println("you are not eligibal");
        }
		}

	}
