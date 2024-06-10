public class RotateArray {
    public static int[] rotate(int [] arr, int howFar, int iterator){
       int temp0 = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length-1] = temp0;
        if(howFar-1 > iterator){
            iterator = iterator+1;
            rotate(arr, howFar, iterator);
        }
        return arr;
    }

    public static int[] rotate2(int [] arr, int howFar){
        int [] temp = new int[howFar];
        int [] temp2 = new int[arr.length - howFar];
        for(int i = 0; i<=howFar-1; i++){
            temp[i] = arr[i];
        }
        for(int i = 0; i<=arr.length - howFar -1; i++){
            temp2[i] = arr[howFar + i];
        }
        for(int i = 0; i<=temp2.length-1; i++){
            arr[i] = temp2[i];
        }
        for(int i = 0; i<=temp.length-1; i++){
            arr[temp2.length+i] = temp[i];
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        int [] t1 = {2, 3, 4, 5, 6, 9, 11};
        printArray(rotate(t1, 3, 0));
        printArray(rotate2(t1, 2));
    }
}
