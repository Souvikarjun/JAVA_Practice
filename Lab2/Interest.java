import java.util.Scanner;

public class Interest{

	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		float P;
		float R;
		float T;

		System.out.print("Input the number of Principle: ");
		P = scanner.nextFloat();

		System.out.print("Input the Rate: ");
		R = scanner.nextFloat();
		
		System.out.print("Input the Time: ");
		T = scanner.nextFloat();


		float interest = P*(R/100)*T;
		float final_amount = P+interest;

		System.out.println("The Interest is: "+interest+"\nThe Final amount is: "+final_amount);
}


}