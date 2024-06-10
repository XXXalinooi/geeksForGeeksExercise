public class FindFirstAndLastIndex {
    public static int first(int[] arr, int numberToFind){
        int iterator = 0;
        while(iterator<arr.length-1 && arr[iterator] != numberToFind){
            iterator = iterator+1;
        }
        if(arr[iterator] == numberToFind){
            return iterator;
        }
        else return -1;
    }

    public static int last(int[] arr, int numberToFind){
        int iterator = arr.length-1;
        while(iterator>=0 && arr[iterator] != numberToFind){
            iterator = iterator-1;
        }
        return iterator;
    }

    static final class FirstAndLastIndex {
        FirstAndLastIndex(int first, int last) {
            System.out.println("First: " + first);
            System.out.println("Last: " + last);
        }
    }

    public static FirstAndLastIndex getFirstAndLastIndex(int[] arr, int numberToFind){
        int first = first(arr, numberToFind);
        if(first != -1){
            int last = last(arr, numberToFind);
            return new FirstAndLastIndex(first, last);
        }
        else return new FirstAndLastIndex(-1, -1);
    }

    public static void main(String[] args) {
        int[] testArr = {2, 5, 2, 87, 0};
        getFirstAndLastIndex(testArr, 0);
    }
}
