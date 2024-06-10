public class FindLCMAndGCDOfNumbers {

    public static int findGCD(int firstNumber, int secondNumber){
        if(secondNumber == 0){
            return firstNumber;
        }
        return findGCD(secondNumber, firstNumber%secondNumber);
    }

    public static int findLCM(int firstNumber, int secondNumber){
        return (firstNumber*secondNumber/findGCD(firstNumber, secondNumber));
    }

    public static void main(String[] args) {
        System.out.println(findGCD(128, 120));
    }
}
