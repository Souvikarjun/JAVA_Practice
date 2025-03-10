package practice_Session_2;

public class Enoding {
    public static void main(String[] args) {
        String string = "SOUVIKARJUN";
        // String RevString = "";
        int[] encodedArray = new int[string.length()/2+1];
        for(int i = ((string.length()/2)); i>=0; i-- ){
            for(int j = 0; j<(string.length()/2)+1;j++){
                if(string.length()%2!=0){
                    if(i==string.length()/2){
                        encodedArray[i] = ((int)string.charAt(i)-65) - string.length();
                    }
                    else{
                        encodedArray[i] = ((int)string.charAt(i)-65) - ((int)string.charAt(j)-65);
                        
                    }
                }
                else{
                    encodedArray[i] = ((int)string.charAt(i) -65) - ((int)string.charAt(j)-65);
                }
            }
        }

        for (int i : encodedArray) {
            if(i<0){
                i = i-2*i;
            }
            System.err.println(i);
        }
        // System.err.println();
        // System.err.println((int)string.charAt(0)-65);
        // System.err.println((int)string.charAt(10)-65);

    }
}
