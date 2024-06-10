import java.util.HashMap;
import java.util.Map;

public class ExceptionallyOdd {
    public static int exceptionallyOdd(int [] arr){
        Map<Integer, Integer> numbersOfOccur = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(numbersOfOccur.containsKey(arr[i])){
                int howManyOcc = numbersOfOccur.get(arr[i]);
                howManyOcc = howManyOcc+1;
                numbersOfOccur.put(arr[i], howManyOcc);
            }
            else{
                numbersOfOccur.put(arr[i], 1);
            }
        }
        for(int i =0; i<arr.length; i++){
            if(numbersOfOccur.get(arr[i])%2 != 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2};
        System.out.println(exceptionallyOdd(arr));
    }
}
