public class PrintPattern2 {
    public static void printPattern(int sizeOfSquare){
        for(int i =0; i<sizeOfSquare; i++){
            for(int j = 0; j<sizeOfSquare; j++){
                System.out.print("*" );
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
