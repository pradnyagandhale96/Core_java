import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter v0 :");
		double v0 = sc.nextDouble();

		System.out.print("Enter v1:");
		double v1 = sc.nextDouble();

		System.out.print("Enter time :");
		double time = sc.nextDouble();

		double averageAccerlation = (v1-v0)/time;
		System.out.println("The average acceleration is :"+averageAccerlation);



	}
}


