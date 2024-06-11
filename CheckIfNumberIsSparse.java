public class CheckIfNumberIsSparse {
    public static int[] convertToBinary(int number){
        int[] result = new int[256];
        int iterator = 0;
        while(number!=0){
            result[iterator] = number%2;
            number = number/2;
            iterator = iterator+1;
        }
        return result;
    }

    public static boolean checkIfNumberIsSparseArr(int[] numberBinary){
        for(int i = 0; i<numberBinary.length-1; i++){
           if(numberBinary[i] == 1 && numberBinary[i+1] == 1){
               return false;
           }
        }
        return true;
    }

    public static boolean checkIfNumberIsSparse(int number){
        int [] binNumber = convertToBinary(number);
        return checkIfNumberIsSparseArr(binNumber);
    }

    public static void main(String[] args) {
        System.out.println(checkIfNumberIsSparse(3));
    }
}
