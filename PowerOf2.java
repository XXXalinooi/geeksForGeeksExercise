public class PowerOf2 {
    static boolean ifNumberIsPowerOf2(int number){
        while(number % 2 == 0){
            number = number/2;
        }
        return number == 1;
    }
    static boolean ifNumberIsPowerOf2SecondWay(int number){
        return (number & number-1)==0;
    }
    public static void main(String[] args) {
        int givenNumber = 0;
        System.out.println(ifNumberIsPowerOf2(givenNumber));
        System.out.println(ifNumberIsPowerOf2SecondWay(givenNumber));
    }
}
