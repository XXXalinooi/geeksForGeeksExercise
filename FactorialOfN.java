public class FactorialOfN {
    public static int findFactorialOfN(int n){
        int result = 1;
        for(int i = n; i > 1; i--){
            result = result*i;
        }
        return result;
    }

    public static int findFactorialOfNSecondWay(int number, int result){
        if(number == 1){
            return result;
        }
        else{
            result = findFactorialOfNSecondWay(number-1, result*number);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findFactorialOfNSecondWay(4, 1));
    }
}
