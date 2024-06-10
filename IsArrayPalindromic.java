public class IsArrayPalindromic {
    public static boolean isNumberPalindromic(int numberToCheck) {
        int inputNumber = numberToCheck;
        int outputNumber = 0;
        int currentLastDigit = 0;
        while(numberToCheck>0){
            currentLastDigit = numberToCheck%10;
            outputNumber = (outputNumber*10) + currentLastDigit;
            numberToCheck = numberToCheck/10;
        }
        return outputNumber == inputNumber;
    }

    public static boolean isNumberPalindromicRecursive(int numberToCheck, int outputNumber, int controlNumber){
        if(numberToCheck < 10){
            int currentLastDigit = numberToCheck%10;
            outputNumber = (outputNumber*10) + currentLastDigit;
            return outputNumber == controlNumber;
        }
        else {
            int currentLastDigit = numberToCheck%10;
            outputNumber = (outputNumber*10) + currentLastDigit;
            numberToCheck = numberToCheck/10;
            return isNumberPalindromicRecursive(numberToCheck, outputNumber, controlNumber);
        }
    }

    public static int isListOfNumbersPalindromic(int[] arrayNumbers) {
        for (int arrayNumber : arrayNumbers) {
            if (!isNumberPalindromicRecursive(arrayNumber, 0, arrayNumber)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int [] testArray = {12321, 777, 909};
        System.out.println(isListOfNumbersPalindromic(testArray));
    }
}
