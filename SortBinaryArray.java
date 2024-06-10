public class SortBinaryArray {
    static boolean[] sorBinaryArray(boolean[] arr, int sizeOfArray){
        boolean [] result = new boolean[sizeOfArray];
        int falseIterator = 0;
        int trueIterator = sizeOfArray-1;
        for(int i = 0; i<sizeOfArray; i++){
            if(!arr[i]){
                result[falseIterator] = false;
                falseIterator = falseIterator + 1;
            }
            else {
                result[trueIterator] = true;
                trueIterator = trueIterator -1;
            }
        }
        return result;
    }

    public static void printAnArray(boolean [] arrToPrint){
        for(boolean abc : arrToPrint){
            System.out.print(" " + abc);
        }
    }
    public static void main(String[] args) {
        boolean [] exampleArray = {true, false, true, false, false, true};
            printAnArray(sorBinaryArray(exampleArray, 6));
    }

}
