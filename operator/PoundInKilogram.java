import java .util.Scanner;
class PoundInKilogram
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter A Number In Pounds:");
		double poundValue=sc.nextDouble();
		double kilogram=poundValue*0.454;
		System.out.println("Number in pound"+poundValue+"pound:"+kilogram+"kilogram.");

	}
}