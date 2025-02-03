import java.util.Scanner;

public class OddEvenSeparation{
	public static void main(String arg[]){
		
		Scanner scanner = new Scanner(System.in);

		int n;
		int val;
		int EvenSum = 0;
		int OddSum = 0;
		System.out.print("Input an integer: ");
		n = scanner.nextInt();

		int length = String.valueOf(n).length();

		for(int i=0; i<length;i++){
			val = n%10;
			n = n/10;
			if(val%2==0){
				EvenSum += val;
			}
			else{
				OddSum += val;
			}
			
		}
		System.out.println("Sum of even numbers: "+ EvenSum+"\nSum of Odd numbers: "+OddSum);
		scanner.close();
	}


}