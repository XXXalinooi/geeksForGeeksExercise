import static java.lang.Math.sqrt;

public class IsNumberPrime {

    public static boolean ifPrimeNumber(int number){
        if(number <= 2 && number > 0){
            return true;
        }
        double numberSqrt = sqrt(number);
        for(int i = 2; i < numberSqrt; i++){
            if((number%i) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ifPrimeNumber(1));
        System.out.println(ifPrimeNumber(11));
        System.out.println(ifPrimeNumber(21));
        System.out.println(ifPrimeNumber(37));
        System.out.println(ifPrimeNumber(144));
    }
}
