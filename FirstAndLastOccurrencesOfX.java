public class FirstAndLastOccurrencesOfX {
    public static int[] firstAndLastOccurrencesOfXFirstSolution(int [] inputArrays, int n){
        int [] output = new int[2];
        int iterator = 0;
        while(iterator < inputArrays.length && inputArrays[iterator] != n){
            iterator = iterator +1;
        }
        if(inputArrays[iterator] == n){
            output[0] = iterator;
        }
        else{
            output[0] = -1;
            output[1] = -1;
            return output;
        }
        iterator = inputArrays.length-1;
        while(iterator >= 0 && inputArrays[iterator] != n){
            iterator = iterator - 1;
        }
        output[1] = iterator;
        return output;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        int [] input = {13, 5, 7, 10, 3, 0, 7, 19};
        printArray(firstAndLastOccurrencesOfXFirstSolution(input, 7));
    }
}
