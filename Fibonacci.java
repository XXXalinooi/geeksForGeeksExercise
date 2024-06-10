import java.lang.reflect.Array;

public class Fibonacci {
    public static void countFibonacci(int N){
        if(N < 1){
            return;
        }
        if(N == 1){
            System.out.println(N);
        }
        if(N == 2){
            System.out.println("1, 1");
        }
        else{
            int[] fib = new int[N];
            fib[0] = 1;
            fib[1] = 1;
            int currentSum = 2;
            int currentSecondIngredient = 1;
            int nextSecondIngredient = 2;
            for(int i = 2; i < N; i++){
                fib[i] = currentSum;
                currentSum = currentSecondIngredient + nextSecondIngredient;
                currentSecondIngredient = nextSecondIngredient;
                nextSecondIngredient = currentSum;
            }
        }
    }
    public static void main(String[] args) {
        countFibonacci(7);
    }
}
