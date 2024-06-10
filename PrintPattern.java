public class PrintPattern {
    static void printSecondPatterSecondWay(int number, int k) {
        if(k > 0){
            for(int j = number; j > 0; j--){
                for(int i = 0; i < k; i++){
                    System.out.print(j);
                }
            }
            System.out.println("\n");
            printSecondPatterSecondWay(number, k-1);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        printSecondPatterSecondWay(5, 5);
    }
}
