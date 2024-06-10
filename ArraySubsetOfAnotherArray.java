import java.util.Arrays;

public class ArraySubsetOfAnotherArray {
    static boolean ifSubset(int[] array1, int[] array2){
        int i = 0;
        int j = 0;
        if(array1.length > array2.length){
            while(j < array2.length){
                if(array1[i] == array2[j]){
                    i = i + 1;
                    j = j + 1;
                }
                else if(array1[i] < array2[j]){
                    i = i +1;
                }
                else if(array1[i] > array2[j]){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 4, 6, 7, 7, 7, 12, 80, 123};
        int[] array2 = {2,3, 4, 7, 7, 80};
        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(ifSubset(array1, array2));

    }
}
