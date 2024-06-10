public class ProductOfArrElements {
    public static int productOfArrayElements(int[] arr, int mod){
        int product = 1;
        for (int i : arr) {
            product = product * i;
        }
        return product%mod;
    }
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        System.out.println(productOfArrayElements(tab, 4));
    }
}
