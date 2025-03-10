package practice_Session_2;

public class Number {
    static int updatedNum = 0;
    public static void main(String[] args) {
        
        String numString = "8910869034";

        int[] NumArray = new int[numString.length()];

        for(int i = 0; i <numString.length();i++){
            NumArray[i] = (int)numString.charAt(i)-48;
            // System.out.println(NumArray[i]);
        }
        
        int[] NewArray = new int[NumArray.length];

        for (int i = 0; i < NumArray.length; i++) {
            if (NumArray[i]%2 ==0) {
                if (i>0 && NumArray[i-1]%2!=0) {
                    NewArray[i-1] = updatedNum;
                    updatedNum = 0;
                    updatedNum+=NumArray[i];
                    if (i>=NumArray.length-1) {
                        NewArray[i] = updatedNum;
                    }
                    
                }
                else{
                    updatedNum+=NumArray[i];
                    if (i>=NumArray.length) {
                        NewArray[i] = updatedNum;
                    }
                }
            }
            else{
                if (i>0 && NumArray[i-1]%2==0 ) {
                    NewArray[i-1] = updatedNum;
                    updatedNum = 0;
                    updatedNum+=NumArray[i];
                    if (i>=NumArray.length-1) {
                        NewArray[i] = updatedNum;
                    }
                    
                }
                else{
                    updatedNum+=NumArray[i];
                    if (i>=NumArray.length-1) {
                        NewArray[i] = updatedNum;
                    }
                }
                
            }
        }
        for (int i : NewArray) {
            System.err.println(i);
        }

    }
}
