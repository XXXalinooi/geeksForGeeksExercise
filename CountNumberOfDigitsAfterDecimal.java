public class CountNumberOfDigitsAfterDecimal {

    public static int numberOfDigits(int a, int b){
        int mod = a%b;
        int digits = 0;
        while(mod!= 0 && digits<=10){
            a = mod*10;
            mod = a%b;
            digits = digits+1;
        }
        if(mod == 0){
            return digits;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfDigits(1, 4));
        System.out.println(numberOfDigits(2, 3));
        System.out.println(numberOfDigits(4, 5));
        System.out.println(numberOfDigits(1, 8));
    }
}
