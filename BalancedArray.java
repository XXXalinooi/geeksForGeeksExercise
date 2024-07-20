public class BalancedArray {
    public static int balancedArray(int [] inputArray){
        int middle = inputArray.length/2;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i<middle; i++){
            leftSum = leftSum+inputArray[i];
        }
        for(int j = middle; j<inputArray.length; j++){
            rightSum = rightSum+inputArray[j];
        }
        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args) {
        int [] input = {1, 2, 4, 6, 0, 1};
        System.out.println(balancedArray(input));
    }
}
