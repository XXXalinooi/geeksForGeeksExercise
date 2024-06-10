import static java.lang.Math.sqrt;

public class FindNumberOfRoundSquaresSmallerThanGivenNumber {

    static int numberOfRoundSquaresSmallerThanGivenNumber(int n){
        return (int) (sqrt(n) -1);
    }

    public static void main(String[] args) {
        int givenNumber = 25;
        System.out.println(numberOfRoundSquaresSmallerThanGivenNumber(givenNumber));
    }
}
