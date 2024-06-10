public class ClosestNumber {
    public static int mySillySolution(int first, int second){
        if(first%second == 0){
            return first;
        }
        int firstAbs = Math.abs(first);
        int secondAbs = Math.abs(second);

        if(firstAbs%secondAbs <= secondAbs/2){
            return first-(first%second);
        }
        else{
            return first+(second-(first%second));
        }
    }
    public static void main(String[] args) {
        System.out.println(mySillySolution(34, 7));
    }
}
