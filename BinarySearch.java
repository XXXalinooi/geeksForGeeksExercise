public class BinarySearch {
    public static int binarySearch(int[] inputSortedArray, int numberToFind){
        if(numberToFind<inputSortedArray[0] || numberToFind>inputSortedArray[inputSortedArray.length-1]){
                return -1;
        }
        int startIndex = 0;
        int endIndex = inputSortedArray.length-1;
        int middle = 0;
        while(startIndex<=endIndex){
            middle = ((startIndex+endIndex)/2);
            if(inputSortedArray[middle]==numberToFind){
                return middle;
            }
            else if(inputSortedArray[middle]<numberToFind){
                startIndex = middle+1;
            }
            else {
                endIndex = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 8};
        System.out.println(binarySearch(input1, 1));
        System.out.println(binarySearch(input1, 2));
        System.out.println(binarySearch(input1, 3));
        System.out.println(binarySearch(input1, 4));
        System.out.println(binarySearch(input1, 5));
        System.out.println(binarySearch(input1, 8));
    }
}
