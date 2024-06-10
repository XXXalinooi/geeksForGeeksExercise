public class BitDifference {

    //https://www.baeldung.com/java-binary-numbers

    public static int properSolution(int a, int b) {
        int c = 0;
        while (a > 0 || b > 0) {
            if ((a & 1) != (b & 1)) {
                c++;
            }
            a = a >> 1;
            b = b >> 1;
        }
        return c;
    }

    public static String firstWayDecimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static String secondWayDecimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            int k = n % 2;
            stringBuilder.append(k);
            n = n / 2;
        }
        return stringBuilder.reverse().toString();
    }

    public static String converseToReverseBin(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            int k = n % 2;
            stringBuilder.append(k);
            n = n / 2;
        }
        return stringBuilder.toString();
    }

    public static int firstWayBinaryToDecimal(String s) {
        return Integer.getInteger(s, 2);
    }

    public static int secondWayBinaryToDecimal(int binaryInt) {
        int decimalNumber = 0;
        int base = 1;

        while (binaryInt > 0) {
            int lastDigit = binaryInt % 10;
            binaryInt = binaryInt / 10;
            decimalNumber += lastDigit * base;
            base = base * 2;
        }
        return decimalNumber;
    }

    public static int bitDifferenceMySillySolution(int first, int second) {
        if (first == second) {
            return 0;
        }
        int bitDifference;
        String firstBinary = converseToReverseBin(first);
        String secondBinary = converseToReverseBin(second);
        if (firstBinary.length() > secondBinary.length()) {
            bitDifference = firstBinary.length() - secondBinary.length();
            for (int i = 0; i < secondBinary.length(); i++) {
                if (firstBinary.charAt(i) != secondBinary.charAt(i)) {
                    bitDifference = bitDifference + 1;
                }
            }
        } else {
            bitDifference = secondBinary.length() - firstBinary.length();
            for (int i = 0; i < firstBinary.length(); i++) {
                if (firstBinary.charAt(i) != secondBinary.charAt(i)) {
                    bitDifference = bitDifference + 1;
                }
            }
        }
        return bitDifference;
    }

    public static void main(String[] args) {
        System.out.println(bitDifferenceMySillySolution(20, 25));
        System.out.println(properSolution(20, 25));
    }
}
