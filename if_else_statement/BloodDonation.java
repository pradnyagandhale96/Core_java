import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	    System.out.println("Enter your age:");
	    int age = sc.nextInt();

	    if(age<20)
	    {
	    	System.out.println("you not donate a blood.try after"+(20-age)+ "years");
	    }
	    else
	    {
	    	System.out.println("you consume cigarette or alcohol in 24 hours(yes/no)");
        
	    String nasha = sc.next().toLowerCase();
		if(nasha.equals("no")) {
	    	System.out.println("Enter your weight:");
	    	double weight = sc.nextDouble();
	    
	    if(weight>=50){
	    	System.out.println("we can pump your blood.");
	    }
	    else{
	    	System.out.println("Go and have some food and increse your weight");
	    }
	}
	    else{
	    	System.out.println("You cannot donate blood because you are in nasha");
	    }



	}
}
}