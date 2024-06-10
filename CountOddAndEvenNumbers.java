public class CountOddAndEvenNumbers {
    public static int[] countOddAndEvenNumbers(int [] tabToCount){
        int odd = 0;
        int even = 0;
        int [] result = new int[2];
        for (int j : tabToCount) {
            if (j % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        result[0] = odd;
        result[1] = even;
        System.out.print("Odd: " + odd + " ");
        System.out.print("Even: " + even);
        return result;
    }

    public static int[] countOddAndEvenNumbersSecondWay(int [] tabToCount){
        int odd = 0;
        int even = 0;
        int [] result = new int[2];
        for (int j : tabToCount) {
            if ((j & 1) == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        result[0] = odd;
        result[1] = even;
        System.out.print("Odd: " + odd + " ");
        System.out.print("Even: " + even);
        return result;
    }
/*
Kiedy bitowo przesuniemy dowolną liczbę w prawo, ostatni bit liczby
zostanie usunięty, gdy jest parzysta lub nieparzysta. Następnie
dokonaliśmy bitowego przesunięcia w lewo, a następnie nasz bit
przesunął się o jeden. Teraz ostatni umieszczony bit jest pusty
i domyślnie jest wypełniony zerem. Podczas tych wszystkich liczb
 nieparzystych zmieniała się ich wartość, ale parzysta pozostaje
taka sama.
 */
    public static int[] countOddAndEvenNumbersThridWay(int [] tabToCount){
        int odd = 0;
        int even = 0;
        int [] result = new int[2];
        for (int j : tabToCount) {
            if ((j >> 1) << 1 == j) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        result[0] = odd;
        result[1] = even;
        System.out.print("Odd: " + odd + " ");
        System.out.print("Even: " + even);
        return result;
    }
    public static void main(String[] args) {
        int [] arrToCheck = {3, 5, 7, 7, 2, 9, 0};
        countOddAndEvenNumbers(arrToCheck);
        countOddAndEvenNumbersSecondWay(arrToCheck);
        countOddAndEvenNumbersThridWay(arrToCheck);
    }
}
