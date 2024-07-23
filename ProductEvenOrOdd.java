public class ProductEvenOrOdd {
    public static boolean isProductEven(String s1, String s2){
        int n1 = Integer.parseInt(String.valueOf(s1.charAt(s1.length()-1)));
        int n2 = Integer.parseInt(String.valueOf(s2.charAt(s2.length()-1)));
        return (n1*n2)%2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isProductEven("45", "20"));
        System.out.println(isProductEven("99", "101"));
        System.out.println(isProductEven("22", "102"));
    }
}
