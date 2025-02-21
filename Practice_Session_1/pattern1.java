package Practice_Session_1;

public class pattern1 {
    public static void main(String[] args) {
    int n =7;
    for(int i =0; i<n;i++){
        for(int j=0; j<n;j++){
            if ((((i==j)||(i+j==n-1)) && i<(n/2)) || (j==(n/2) && i>=(n/2))) {
                System.err.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.err.print("\n");
    }


    }
}
