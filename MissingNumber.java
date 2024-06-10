import java.util.Arrays;

public class MissingNumber {
    public static int findMissNmbMySillySolution(int [] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] != 1){
                return arr[i]+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {5, 4, 2, 1, 7, 6};
        System.out.println(findMissNmbMySillySolution(arr));
    }
}
