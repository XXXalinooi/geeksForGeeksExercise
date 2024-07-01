import java.util.ArrayList;

public class SumOfNumbersInString {
    public static boolean isGivenCharacterADigit(char c){
        return ((int) c >= 48 && (int) c <= 57);
    }

    public static int sumOfNumbersInString(String s1) {
        StringBuilder temp = new StringBuilder();
        int sum = 0;
        for(int i = 0; i < s1.length(); i++){
            if(isGivenCharacterADigit(s1.charAt(i))){
                temp.append(s1.charAt(i));
            }
            else{
                if (!temp.isEmpty()) {
                    sum = sum + Integer.parseInt(temp.toString());
                    temp.setLength(0);
                }
            }
        }
        if(!temp.isEmpty()){
            sum = sum + Integer.parseInt(temp.toString());
            temp.setLength(0);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(sumOfNumbersInString("12gh8yuu4"));
    }
}
