public class NumberSearch {
    static int search(int[] givenTab, int givenNumber, int startIndex, int endIndeks){
        int actualPosition = (startIndex + endIndeks) /2;
        System.out.println( "Na indeksie " + actualPosition + " start indeks " + startIndex + "end indeks" + endIndeks + "\n");
        if(givenTab[actualPosition] == givenNumber){
            System.out.println("Znaleziono wartość na indeksie " + actualPosition);
            return actualPosition;
        }
        else if(givenTab[actualPosition] < givenNumber){
            startIndex = actualPosition + 1;
        }
        else if(givenTab[actualPosition] > givenNumber){
           endIndeks = actualPosition - 1;
        }
        else {
            return -1;
        }
        search(givenTab, givenNumber, startIndex, endIndeks);
        return actualPosition;
    }
    public static void main(String[] args) {
        int[] tab = {0, 1,  3, 5, 6, 12, 90, 324, 659, 780, 900, 2000, 2001};
        int number = 90;
        int result = search(tab, number, 0, tab.length-1);
        if(result == -1){
            System.out.println("Nie ma takiej wartości");
        }
        System.out.println(result);
    }
}
