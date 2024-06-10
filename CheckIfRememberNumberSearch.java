public class CheckIfRememberNumberSearch {
    public static int search(int numberToSearch, int startIndex, int endIndex, int[] tabToSearchIn){
        int actualPosition = (startIndex + endIndex)/2;
        System.out.println("jestem na indeksie " + actualPosition + "\n");
        if(tabToSearchIn[actualPosition] == numberToSearch){
            System.out.println("znalazłem szukany element na indeksie " + actualPosition);
            return actualPosition;
        }
        else if(numberToSearch < tabToSearchIn[actualPosition]){
            endIndex = actualPosition -1;
        }
        else if(numberToSearch > tabToSearchIn[actualPosition]){
            startIndex = actualPosition + 1;
        }
       else {
            return -1;
        }
        search(numberToSearch, startIndex, endIndex, tabToSearchIn);
        return actualPosition;
    }
    public static void main(String[] args) {
        int [] testArr = {2, 6, 15, 29, 90, 304, 509, 1008};
       search(15, 0, testArr.length -1, testArr);

    }
}
