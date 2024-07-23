public class ProductOfArrayElements {
    public static long productOfArrayElements(int [] inputArray){
        long dividend = 1;
        int divisor = 1000000007;
        for (int j : inputArray) {
            dividend = dividend * j;
        }
        return dividend%divisor;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        int [] arr2 = {100000, 100000, 100000};
        System.out.println(productOfArrayElements(arr));
        System.out.println(productOfArrayElements(arr2));
    }
}
