package practice_Session_2;
import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        String name = "Souvikarjun";
        int Year = 2004;
        String number = "8910869034";
        String Newstring = "";

        // Name Part

        if (name.length()<=4) {
            Newstring = Newstring + name.toUpperCase();
        }
        else{
            Newstring = Newstring + name.substring(0, 4).toUpperCase();
        }

        
        //Contact no part
        
        int[] NumArray = new int[number.length()];
        
        for(int i = 0; i<number.length(); i++){
            NumArray[i] = (int)number.charAt(i) - 48;
        }
        
        Arrays.sort(NumArray);
        
        
        String newNum = "";
        if (NumArray[0] != 0) {
            newNum = Integer.toString(NumArray[0]) + Integer.toString(NumArray[1]) + Integer.toString(NumArray[2]);
        }
        else if (NumArray[1] != 0) {
            newNum = Integer.toString(NumArray[1]) + Integer.toString(NumArray[0]) + Integer.toString(NumArray[2]);
        }
        else if (NumArray[2] != 0){
            newNum = Integer.toString(NumArray[2]) + Integer.toString(NumArray[0]) + Integer.toString(NumArray[1]);
        }
        else{
            int index = 0;
            for(int x : NumArray){
                if (x!=0) {
                    newNum = Integer.toString(NumArray[index]) + Integer.toString(NumArray[0]) + Integer.toString(NumArray[1]);
                    break;
                }
                index++;                  
            }
        }
        Newstring = Newstring + newNum;
        
       
        
        // DOB Part

        String stryear = Integer.toString(Year);
        int[] YearArray = new int[stryear.length()];
        
        for(int i = 0; i<stryear.length(); i++){
            YearArray[i] = (int)stryear.charAt(i) - 48;
            // System.err.println(NumArray[i]);
        }
        
        int lastDig = 0;
        boolean found = false;
        
        if (YearArray[0]%2==0) {
            for(int i=1; i<YearArray.length;i++){
                if (YearArray[i]%2 != 0) {
                    lastDig = YearArray[i];
                    found = true;
                    break;
                }
            }
        }
        else {
            for(int i=1; i<YearArray.length;i++){
                if (YearArray[i]%2 == 0) {
                    lastDig = YearArray[i];
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            Newstring = Newstring + Integer.toString(lastDig);
        }
        else{
            Newstring += Integer.toString(YearArray[0]);
        }



        System.err.println(Newstring);
    }
}
