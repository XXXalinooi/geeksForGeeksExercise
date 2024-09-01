public class MissingNumber {
    public static int findMissingNumber(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int sumWithoutMissingNumber = (2+arr.length)* (arr.length+1)/2;
        return sumWithoutMissingNumber - sum;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 7, 8, 3,6};
        System.out.println(findMissingNumber(arr));
    }
}
