import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] tab1, int[] tab2){
        int resultTypeSize = tab1.length*2;
        int[] result = new int[resultTypeSize];
        int tab1Index=0;
        int tab2Index=0;
        boolean tab1Flag = true;
        boolean tab2Flag = true;
        int i =0;
        while(i<resultTypeSize){
            if((tab1[tab1Index] < tab2[tab2Index] && tab1Index <= tab1.length-1) && tab1Flag||(!tab2Flag)){
                if(tab1Index == tab1.length-1){
                    tab1Flag = false;
                    result[i] = tab1[tab1Index];
                }
                else{
                    result[i] = tab1[tab1Index];
                    tab1Index = tab1Index+1;
                }
                i++;
            }
            if((tab2[tab2Index] < tab1[tab1Index] && tab2Index <= tab2.length-1) && tab2Flag ||(!tab1Flag)){
                if(tab2Index == tab2.length-1){
                    tab2Flag = false;
                    result[i] = tab2[tab2Index];
                }
                else{
                    result[i] = tab2[tab2Index];
                    tab2Index = tab2Index+1;
                }
                i++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
    public static void main(String[] args) {
        int [] tabToSort1 = {2, 5, 7, 9, 12};
        int [] tabToSort2 = { 8, 13, 20, 27, 80};
        printArray(merge(tabToSort1, tabToSort2));
    }
}
