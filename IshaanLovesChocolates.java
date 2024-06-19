import java.beans.PropertyEditorManager;
import java.util.ArrayList;
import java.util.Arrays;

public class IshaanLovesChocolates {
    public static int chocolateToSisterFirstWay(int[] rateOfChocolates) {
        ArrayList<Integer> rates = new ArrayList<>();
        for (int rateOfChocolate : rateOfChocolates) {
            rates.add(rateOfChocolate);
        }
        while (rates.size() != 1) {
            if (rates.get(0) > rates.get(rates.size() - 1)) {
                rates.remove(0);
            } else {
                rates.remove(rates.size() - 1);
            }
        }
        return rates.get(0);
    }

    //only this is O(N) solution
    public static int chocolateToSisterSecondWay(int [] rates){
        int start = 0;
        int end = rates.length-1;
        while(start < end){
            if(rates[start] > rates[end]){
                start = start +1;
            }
            else{
                end = end -1;
            }
        }
        return rates[start];
    }

    public static int chocolateToSisterThirdWay(int[] rates){
        Arrays.sort(rates);
        return rates[0];
    }

    public static void main(String[] args) {
        int[] rates = {5, 3, 1, 6, 9};
        int[] rates2 = {5, 9, 2, 6};
        System.out.println(chocolateToSisterFirstWay(rates));
        System.out.println(chocolateToSisterFirstWay(rates2));
        System.out.println(chocolateToSisterSecondWay(rates));
        System.out.println(chocolateToSisterSecondWay(rates2));
        System.out.println(chocolateToSisterThirdWay(rates));
        System.out.println(chocolateToSisterThirdWay(rates2));
    }
}
