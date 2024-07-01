public class GameWithNos {

    public static int getXOROfTwoNumbersFirstWay(int n1, int n2){
        int res = 0;
        for(int i = 0; i <= 31; i++){
            if (((1 << i) & n1) != ((1 << i) & n2)) {
                res |= (1 << i);
            }
        }
        return res;
    }

    public static int getXOROfTwoNumbersSecondWay(int n1, int n2){
        return (n1 | n2) & (~n1 | ~n2);
    }

    public static int getXOROfTwoNumbersThirdWay(int n1, int n2){
        return (n1 + n2) - 2 * (n1 & n2);
    }

    public static int[] gameWithNos(int[] inputArray){
        int [] outputArray = new int[inputArray.length];
        for(int i = 0; i < inputArray.length -1; i++){
            outputArray[i] = getXOROfTwoNumbersSecondWay(inputArray[i], inputArray[i+1]);
        }
        outputArray[inputArray.length-1] = inputArray[inputArray.length-1];
        return outputArray;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        System.out.println(getXOROfTwoNumbersFirstWay(3, 5));
        System.out.println(getXOROfTwoNumbersSecondWay(3, 5));
        System.out.println(getXOROfTwoNumbersThirdWay(3, 5));

        int[] arr1 =  {10, 11, 1, 2, 3};
        printArray(gameWithNos(arr1));
    }
}
