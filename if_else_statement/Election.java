import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age:");
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("Do u have a voter ID(yes/no):");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println("********Welcome********");
				System.out.println("1.BJP");
				System.out.println("2.Congress");
				System.out.println("3.AAP");
				System.out.println("4.MNS");
				System.out.println("5.Shivsena");
				System.out.println("6.NCP");
				System.out.println("7.NOTA");

				System.out.println("Enter the option to vote for youe fav party:");
				String vote = sc.next().toUpperCase();
				if(vote.equals("BJP")){
					System.out.println("You have votes for BJP");
				}else if (vote.equals("Congress"))
				{
					System.out.println("You have vote for Congress");
				}
				else if (vote.equals("Congress"))
				{
					System.out.println("You have vote for Congress");
				}
				else if (vote.equals("AAP"))
				{
					System.out.println("You have vote for AAP");
				}
				else if (vote.equals("MNS"))
				{
					System.out.println("You have vote for MNS");
				}
				else if (vote.equals("shivsena"))
				{
					System.out.println("You have vote for shivsena");
				}
				else if (vote.equals("NCP"))
				{
					System.out.println("You have vote for NCP");

				}
				else if (vote.equals("NOTA"))
				{
					System.out.println("You are wasted your vote");
				}
				else
				{
					System.out.println("Invalid Input");				}
				}
				else{
					System.out.println("niklo yase");
				}
			}
				else {
					System.out.println("you are not mature to vote try after" +(18-age)+ "years.");
				}
				
				

			}
		}
	
