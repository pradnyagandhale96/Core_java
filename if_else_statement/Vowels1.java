import java.util.Scanner;
class Vowels1
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a character:");
	String alpa = sc.next().toLowerCase();

	if(alpa.equals("a"))
	{
		System.out.println("Alpabet is a vowels");
	}
	else if (alpa.equals("e"))
	{
		System.out.println("Alpabet is a vowels");
	}
	else if(alpa.equals("i"))
	{
		System.out.println("Alpabet is a vowels");
	}
	else if(alpa.equals("o"))
	{
		System.out.println("Alpabet is a vowels");
	}
	else if(alpa.equals("u"))
	{
		System.out.println("Alpabet is a vowels");
	}	
	else 
	{
		System.out.println("Alphabet is a consonents");
	}
	}
}