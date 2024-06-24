public class BinaryNumberToDecimal {
    public static int convertBinaryNumberToDecimalFirstWay(String binaryNumber){
        int number = 0;
        int power=0;
        for(int i = binaryNumber.length()-1; i>=0; i--){
            if(binaryNumber.charAt(i) == '1'){
                number = (int) (number + Math.pow(2, power));
            }
            power = power+1;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(convertBinaryNumberToDecimalFirstWay("1111"));
        System.out.println(convertBinaryNumberToDecimalFirstWay("10000"));
        System.out.println(convertBinaryNumberToDecimalFirstWay("10"));
    }
}
