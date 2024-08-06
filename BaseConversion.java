public class BaseConversion {

    public static String decimalNumberToBinary(int number){
        StringBuilder s = new StringBuilder();
        while (number >0) {
            s.append(number%2);
            number = number/2;
        }
        s.reverse();
        return s.toString();
    }

    public static String binaryToDecimal(int number){
        int pow = 1;
        String n = String.valueOf(number);
        int index = n.length()-1;
        int result = 0;
        while(index>=0){
            if(n.charAt(index) == '1'){
                result = result + pow;
            }
            pow = pow*2;
            index = index -1;
        }
        return String.valueOf(result);
    }

    public static String decimalToHexadecimal(int n){
        StringBuilder s = new StringBuilder();
        while (n >0) {
            int digit = n%16;
            String letter = switch (digit){
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> String.valueOf(digit);
            };
            s.append(letter);
            n = n/16;
        }
        s.reverse();
        return s.toString();
    }

    public static String hexadecimalToDecimal(String s){
        int pow = 1;
        int index = s.length()-1;
        int result = 0;
        int digit;
        while(index>=0){
            digit = switch (s.charAt(index)) {
                case 'A' -> 10;
                case 'B' -> 11;
                case 'C' -> 12;
                case 'D' -> 13;
                case 'E' -> 14;
                case 'F' -> 15;
                default -> Character.getNumericValue(s.charAt(index));
            };
            result = result + digit *pow;
            pow = pow*16;
            index = index -1;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(decimalNumberToBinary(6));
        System.out.println(binaryToDecimal(110));
        System.out.println(decimalToHexadecimal(20));
        System.out.println(hexadecimalToDecimal("2A"));

        System.out.println(decimalNumberToBinary(10));
        System.out.println(binaryToDecimal(111));
        System.out.println(decimalToHexadecimal(25));
        System.out.println(hexadecimalToDecimal("FA"));
    }
}
