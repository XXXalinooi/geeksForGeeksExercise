public class PrintPattern3 {

    public static void printPattern(int n){
        int start = (n-1)*2+1;
        while(start > 0){
            for(int i =0; i<start; i++){
                System.out.print("*");
            }
            start = start -2;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
