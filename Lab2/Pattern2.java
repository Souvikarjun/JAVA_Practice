import java.util.Scanner;

public class Pattern2{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of rows: ");
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++){
			if(i%2 == 0){
				System.out.print("*");
			}
			else{
				for(int j=0; j<i; j++){
					System.out.print("*");
				}	
			}
			System.out.print("\n");
		}
		scanner.close();
	}

}
