public class SortAnArray {

    public static void swap(int[] arr, int index){
        int temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;
    }

    public static int[] mySorting(int[] tabToSort, int myPointer){
        if(tabToSort[myPointer] > tabToSort[myPointer+1]){
            swap(tabToSort, myPointer);
        }
        while(myPointer < tabToSort.length-2){
            myPointer++;
            if(tabToSort[myPointer] > tabToSort[myPointer+1]){
                swap(tabToSort, myPointer);
                mySorting(tabToSort, myPointer-1);
            }
            else{
                mySorting(tabToSort, myPointer);
            }
        }
        return tabToSort;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        int[] tabToSort = {6, 3, 1, 5, 4, 7};
        int [] sortedArr = mySorting(tabToSort, 0);
        printArray(sortedArr);
    }
}
