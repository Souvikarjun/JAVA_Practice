import java.util.Scanner;

public class Pattern{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of rows: ");
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		scanner.close();
	}

}
