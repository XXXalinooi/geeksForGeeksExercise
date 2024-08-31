import java.lang.reflect.Array;
import java.util.Arrays;

public class StableSortAndPosition {
    public static int stableSortAndPosition(int[] inputArr, int index){
        int number = inputArr[index];
        int numberOccur = 0;
        for(int i =0; i<index; i++){
            if(inputArr[i] == number){
                numberOccur = numberOccur+1;
            }
        }
        Arrays.sort(inputArr);
        int i = 0;
        while(inputArr[i]!=number){
            i = i+1;
        }
        return i+numberOccur;
    }

    public static void main(String[] args) {
        int[] inputArr = {3, 4, 3, 5, 2, 3, 4, 3, 1, 5};
        System.out.println(stableSortAndPosition(inputArr, 5));
    }
}
