package Practice_Session_1;

public class pattern3 {
    public static void main(String[] args) {
    int n = 9;
        for(int i =0; i<n;i++){
            for(int j=0; j<n;j++){
                if ((i==0||i==n-1)&&j==n/2 || (j==0||j==n-1) && i==n/2 || (i==(n/2)-j) || (i==(n/2)+j) || (j==(n/2)+i) || (j==(n/2)-(i-n+1))) {
                    System.err.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    
    
        }
}
