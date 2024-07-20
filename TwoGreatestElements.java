public class TwoGreatestElements {

    public static int[] twoElements(int [] inputArray){
        if(inputArray.length >= 2){
            int firstNumber = inputArray[0];
            int secondNumber = 0;
            int firstIndex = 0;
            int secondIndex = 0;
            for(int i = 0; i < inputArray.length; i++){
                if(inputArray[i] > firstNumber){
                    firstNumber = inputArray[i];
                    firstIndex = i;
                    System.out.println("Znalazlem nowy najwiekszy element " + firstNumber + " Na indeksie "+ firstIndex);
                }
            }
            int[] outputArray1 = new int[inputArray.length-1];
            System.arraycopy(inputArray, 0, outputArray1, 0, firstIndex);
            if (outputArray1.length - firstIndex >= 0)
                System.arraycopy(inputArray, firstIndex + 1, outputArray1, firstIndex, outputArray1.length - firstIndex);
            int [] outputArray2 = new int[inputArray.length-2];
            for(int i = 0; i < outputArray1.length; i++){
                if(outputArray1[i] > secondNumber){
                    secondNumber = outputArray1[i];
                    secondIndex = i;
                    System.out.println("Znalazlem nowy najwiekszy 2 element " + secondNumber + " Na indeksie "+ secondIndex);
                }
            }
            System.arraycopy(outputArray1, 0, outputArray2, 0, secondIndex);
            if (outputArray2.length - secondIndex >= 0)
                System.arraycopy(outputArray1, secondIndex + 1, outputArray2, secondIndex, outputArray2.length - secondIndex);
            return outputArray2;
        }
        else{
            int [] outputArray = {-1};
            System.out.println("Wrong input data format");
            return outputArray;
        }
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        int [] input = {13, 5, 7, 10, 3, 0, 18, 19};
        printArray(twoElements(input));
    }
}
