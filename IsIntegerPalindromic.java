import java.util.ArrayList;
import java.util.Arrays;

public class IsIntegerPalindromic {
    static public boolean isIntegerPalindromic(int a){
        ArrayList<Integer> digits = new ArrayList<>();
        while (a > 0){
            int k = a%10;
            digits.add(k);
            a = a/10;
        }
        StringBuilder s = new StringBuilder();
        for (Integer digit : digits) {
            s.append(digit);
        }
        String result = s.toString();
        String reverse = s.reverse().toString();
        return result.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isIntegerPalindromic(745647));
    }
}
