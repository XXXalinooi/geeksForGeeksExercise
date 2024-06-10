import java.lang.reflect.Array;
import java.util.Arrays;

public class Median {
    public static int findMedian(int[] arr){
        Arrays.sort(arr);
        if(arr.length%2 == 0){
            return Math.floorDiv((arr[arr.length/2-1])+(arr[arr.length/2]), 2);
        }
        else{
            return (arr[(arr.length-1)/2]);
        }
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6};
        System.out.println(findMedian(testArray));
    }
}
