public class LastIndexOfOne {
    public static int lastIndexOfOne(String s){
        int index = -1;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                index = i;
            }
        }
        return index;
    }

    public static int lastIndexOfOneSecondWay(String s){
        int index = -1;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String testStr = "001001010111010";
        System.out.print(lastIndexOfOne(testStr));
        System.out.print(lastIndexOfOneSecondWay(testStr));
    }
}
