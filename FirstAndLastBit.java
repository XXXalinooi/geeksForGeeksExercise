public class FirstAndLastBit {

    public static StringBuilder convertToBinary(int number){
        StringBuilder stringBuilder = new StringBuilder();
        while(number > 0){
            stringBuilder.append(number%2);
            number = number/2;
        }
        return stringBuilder;
    }

    public static boolean checkFirstAndLastChar(StringBuilder s){
        if(s.charAt(0) != '1' || s.charAt(s.length()-1) != '1'){
            return false;
        }
        s.deleteCharAt(0);
        s.deleteCharAt(s.length()-1);
        return !s.toString().contains("1");
    }

    public static boolean isOnlyFirstAndLastBitSet(int number){
        return checkFirstAndLastChar(convertToBinary(number));
    }

    public static void main(String[] args) {
        System.out.println(isOnlyFirstAndLastBitSet(9));
        System.out.println(isOnlyFirstAndLastBitSet(15));
        System.out.println(isOnlyFirstAndLastBitSet(17));
        System.out.println(isOnlyFirstAndLastBitSet(22));
    }
}
