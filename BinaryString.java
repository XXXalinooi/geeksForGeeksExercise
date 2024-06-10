public class BinaryString {
    public static int countHowManySubstrings(String s){
        int onesCounter = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                onesCounter = onesCounter+1;
            }
        }
        return onesCounter + (onesCounter*(onesCounter-3)/2);
    }
    public static void main(String[] args) {
        System.out.println(countHowManySubstrings("1111"));
    }
}
