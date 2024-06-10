public class SumOfFirstNTerms {
    public static int sumOfFirstNTerms(int n){
        int result = 0;
        for(int i = 1; i<=n; i++){
            result = (int) (result+Math.pow(i, 3));
        }
        return result;
    }

    public static int sumOfFirstNTerms2(int n){
        if(n == 0){
            return 0;
        }
        return (int) (Math.pow(n, 3) + sumOfFirstNTerms2(n-1));
    }
    public static void main(String[] args) {
        System.out.println(sumOfFirstNTerms(7));
        System.out.println(sumOfFirstNTerms2(7));
    }
}
