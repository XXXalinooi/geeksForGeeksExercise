public class SumOfDigitsPalindrome {
    public static int createSumOfDigits(int number){
        int sum = 0;
        int digit;
        while(number>0){
            digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        return sum;
    }
    public static StringBuilder convertNumbersToDigits(int number){
        int digit;
        StringBuilder stringBuilder = new StringBuilder();
        while(number>0){
            digit = number%10;
            stringBuilder.append(digit);
            number = number/10;
        }
        return stringBuilder;
    }
    public static boolean compereReverseString(StringBuilder stringBuilder){
        String s1 = stringBuilder.toString();
        String s2 = stringBuilder.reverse().toString();
        return s1.equals(s2);
    }
    public static boolean isSumOfDigitsPalindrome(int number){
        return compereReverseString(convertNumbersToDigits(createSumOfDigits(number)));
    }

    public static void main(String[] args) {
        System.out.println(isSumOfDigitsPalindrome(56));
        System.out.println(isSumOfDigitsPalindrome(98));
        System.out.println(isSumOfDigitsPalindrome(2));
    }
}
