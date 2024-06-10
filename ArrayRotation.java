import java.util.Arrays;

public class ArrayRotation {
    static int[] rotateArrayByOne(int [] arrayToRotate){
        int newFirstElement = arrayToRotate[arrayToRotate.length-1];
        int[] newArray = new int[arrayToRotate.length];
        newArray[0] = newFirstElement;
        System.arraycopy(arrayToRotate, 0, newArray, 1, arrayToRotate.length - 1);
        return newArray;
    }
    static int[] rotateArrayByOneSecondWay(int [] arrayToRotate){
        int newFirstElement = arrayToRotate[arrayToRotate.length-1];
        for(int i = arrayToRotate.length -1; i > 0; i--){
            arrayToRotate[i] = arrayToRotate[i-1];
        }
        arrayToRotate[0] = newFirstElement;
        return arrayToRotate;
    }
    public static void main(String[] args) {
        int[] testArray = {2, 9};
        System.out.println(Arrays.toString(rotateArrayByOne(testArray)));
        System.out.println(Arrays.toString(rotateArrayByOneSecondWay(testArray)));

    }
}
