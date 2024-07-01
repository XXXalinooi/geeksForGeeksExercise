import java.util.HashSet;
import java.util.Set;

public class ElementsInTheRange {
    public static boolean areElementsInRange(int start, int end, int[]arr){
        if(start>end){
            return false;
        }
        Set<Integer> s1 = new HashSet<>();
        for (int j : arr) {
            s1.add(j);
        }
        for(int i = start; i<=end; i++){
            if(!s1.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 8, 9, 10, 34, 94, 0, 3};
        System.out.println(areElementsInRange(0, 5, array));
        System.out.println(areElementsInRange(8, 10, array));
        System.out.println(areElementsInRange(1, 1, array));
        System.out.println(areElementsInRange(3, 3, array));
    }
}
