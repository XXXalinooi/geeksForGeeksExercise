import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsortedArray {

    public static int[] removeDuplicates(int[] input){
        Set<Integer> numbers =new HashSet<>();
        int[] outputTemp = new int[input.length];
        for(int i =0, j=0; i<input.length; i++){
            if(!numbers.contains(input[i])){
                numbers.add(input[i]);
                outputTemp[j] = input[i];
                j++;
            }
        }
        return Arrays.copyOf(outputTemp, numbers.size());
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] array1 = {2, 4, 6, 2, 1, 7, 6, 6};
        int [] array2 = {2, 4, 6, 10, 1, 7, 16, 61};
        int [] array3 = {2, 4, 2, 2, 2, 2, 2, 2};
        printArray(removeDuplicates(array1));
        printArray(removeDuplicates(array2));
        printArray(removeDuplicates(array3));
    }
}
