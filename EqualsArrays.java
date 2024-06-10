import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EqualsArrays {
    static boolean ifEquals(int[] array1, int[] array2){
        ArrayList<Integer> arrayOne = new ArrayList<>();
        ArrayList<Integer> arrayTwo = new ArrayList<>();

        for(int i = 0; i < array1.length; i++){
            arrayOne.add(array1[i]);
            arrayTwo.add(array2[i]);
        }
        Collections.sort(arrayOne);
        Collections.sort(arrayTwo);

        return arrayOne.equals(arrayTwo);
    }
    public static void main(String[] args) {
        int[] array1 = {1, 6, 2, 7, 8, 38};
        int[] array2 = {1, 6, 2, 7, 8, 38};

        System.out.println(ifEquals(array1, array2));
    }
}
