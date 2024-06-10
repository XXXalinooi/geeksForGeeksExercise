import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class UnionOfTwoArrays {
    public static int sizeUnionOfTwoArrays(int[] tab1, int[] tab2, int size1, int size2){
        Map<Integer, Boolean> union = new HashMap<>();
        if(size1 > size2){
            for(int i = 0; i < size2; i++){
                if(!union.containsKey(tab1[i])){
                    union.put(tab1[i], true);
                }
                if(!union.containsKey(tab2[i])){
                    union.put(tab2[i], true);
                }
            }

            for(int j = size2; j < size1; j++){
                if(!union.containsKey(tab1[j])){
                    union.put(tab1[j], true);
                }
            }
        }
        else {
            for(int i = 0; i < size1; i++){
                if(!union.containsKey(tab1[i])){
                    union.put(tab1[i], true);
                }
                if(!union.containsKey(tab2[i])){
                    union.put(tab2[i], true);
                }
            }

            for(int j = size1; j < size2; j++){
                if(!union.containsKey(tab2[j])){
                    union.put(tab2[j], true);
                }
            }
        }
        return union.size();
    }
    public static void main(String[] args) {
        int[] array1 = {1, 6, 2, 7, 8, 38};
        int[] array2 = {1, 9, 7, 6, 40, 38, 9};
        int sizeA1 = array1.length;
        int sizeA2 = array2.length;

        System.out.println(sizeUnionOfTwoArrays(array1, array2, sizeA1, sizeA2));
    }
}
