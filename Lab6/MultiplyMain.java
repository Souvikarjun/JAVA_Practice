package Lab6;

import java.util.Scanner;

public class MultiplyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MultiplyMain mul = new MultiplyMain();


        int n = 100;
        int[] arr = new int[100];
        
        for(int i = 0; i <= n; i++){
            System.out.print("Enter the Number (Press * to stop) ");
            String Num = scanner.nextLine();
            if (Num.equals("*")) {
                break;         
            }
            else{
                for(int j=0; j<=2; j++){
                    try {
                        arr[i] = Integer.parseInt(Num);
                    }  
                    catch (Exception e) {
                        if (j<=2){
                            System.out.println("Non Number Try again.");
                        }
                        else{
                            System.out.println("Too many try");
                            break;
                        }
                        Num = scanner.nextLine();
                    }
                }
            }
        }

        int ans;
        int len = 0;
        for(int i=0; arr[i]!=0;i++){
            len+=1;
        }

        if (len ==2) {
            ans = mul.multiply(arr[0], arr[1]);
        }
        else if(len ==3){
            ans = mul.multiply(arr[0], arr[1], arr[2]);
        }

        else{
            ans = mul.multiply(arr);
        }

        System.out.println("multiplication = "+ ans);


        scanner.close();
    }



    int multiply(int a, int b) {
        return a*b;
    }

    int multiply(int a, int b, int c) {
        return a*b*c;
    }

    int multiply(int[] a) {
        int multiple = 1;
        for(int i =0; a[i]!=0; i++){
            multiple = multiple*a[i];
        }

        return multiple;
    }

}