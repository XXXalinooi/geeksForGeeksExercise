public class PerfectNumber {

    public static int countFactorial(int n){
        int factorial = 1;
        while(n>0){
            factorial = factorial*n;
            n = n-1;
        }
        return factorial;
    }

    public static boolean isNumberPerfectNumber(int n){
        int factorialSum = 0;
        int originalN = n;
        int tempNumber;

        while(n >0){
           tempNumber = n%10;
           factorialSum = factorialSum + countFactorial(tempNumber);
           n = n/10;
        }

        return factorialSum == originalN;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPerfectNumber(23));
        System.out.println(isNumberPerfectNumber(145));
    }
}
