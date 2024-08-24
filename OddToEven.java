import java.util.Arrays;

public class OddToEven {

    public static String swap(int index, String s){
        char temp1 = s.charAt(s.length()-1);
        char temp2 = s.charAt(index);
        char [] result = s.toCharArray();
        result[index] = temp1;
        result[s.length()-1] = temp2;
        return String.valueOf(result);
    }

    public static String oddToEven(String string){
        int oddDigitAtLastIndex = string.charAt(string.length()-1);
        int temp;
        for(int i = 0; i<string.length()-2; i++){
            temp = string.charAt(i);
            if(temp%2 == 0 && temp<oddDigitAtLastIndex){
               return swap(i, string);
            }
        }
        for(int i = string.length()-2; i>0; i--){
            temp = string.charAt(i);
            if(temp%2 == 0){
                return swap(i, string);
            }
        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(oddToEven("1893"));
        System.out.println(oddToEven("244441"));
        System.out.println(oddToEven("1793"));
        System.out.println(oddToEven("4543"));
        System.out.println(oddToEven("1010101"));
    }
}
