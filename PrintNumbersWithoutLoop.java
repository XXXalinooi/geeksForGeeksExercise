public class PrintNumbersWithoutLoop {
    public static void printNumber(int startIndex, int maxNumber){
        if(startIndex > maxNumber){
           return;
       }
       else{
           System.out.println(startIndex + "\n");
           printNumber(startIndex +1, maxNumber);
       }
    }
    public static void main(String[] args) {
        printNumber(0, 6);
    }
}
