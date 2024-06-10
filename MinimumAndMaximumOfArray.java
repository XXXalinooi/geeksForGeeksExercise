import java.util.Arrays;

public class MinimumAndMaximumOfArray {
    static void findMinAndMax(int [] tabToFind){
        int maximum = tabToFind[0];
        int minimum = tabToFind[0];
        for(int i = 1; i < tabToFind.length; i++){
            if(tabToFind[i] < minimum){
                minimum = tabToFind[i];
            }
            if(tabToFind[i] > maximum){
                maximum = tabToFind[i];
            }
        }
        System.out.println("Max: " + maximum);
        System.out.println("Min: " + minimum);
    }

    static void findMinAndMaxSecondWay(int [] tabToFind){
        Arrays.sort(tabToFind);
        int maximum = tabToFind[tabToFind.length-1];
        int minimum = tabToFind[0];
        System.out.println("Max: " + maximum);
        System.out.println("Min: " + minimum);
    }

    public static void main(String[] args) {
        int [] tabToFindMinAndMax = {2, 8, 70, 1, 23, 9};
        findMinAndMax(tabToFindMinAndMax);
        findMinAndMaxSecondWay(tabToFindMinAndMax);
    }
}
