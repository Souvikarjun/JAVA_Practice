import java.util.Scanner;

public class PrimeNum {
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		int x;
		int y;
		int n;

		System.out.print("Input the number of Prime: ");
		n = scanner.nextInt();

		System.out.print("Input the Lower limit: ");
		x = scanner.nextInt();
		
		System.out.print("Input the higher limit: ");
		y = scanner.nextInt();

		while(y<=x){
			if(y>x){
				break;
			}
			else{
				System.out.print("Input the higher limit: ");
				y = scanner.nextInt();
				continue;
			}
		}
		int[] array;
		array = new int[n];
		int check = 0;
		int i = 0;
		for(int j=x; j<=y; j++){
			for(int k=2; k<j; k++){
				if(j%k == 0){
					check = 1;
					break;
				}
			}
			if(check == 0){
				array[i] = j;
				i+=1;
			}
			check = 0;
			if(i>=n){break;}
			
		}

		for(int c=0; c<n; c++){
			System.out.println(array[c]);
		}
		
	scanner.close();		
}

}