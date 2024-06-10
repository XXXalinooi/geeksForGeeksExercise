import java.util.Arrays;

public class ReverseSubArray {

    static int[] swap(int[] tabToSwap, int startPoint, int endPoint){
        int valueAtStartPoint = tabToSwap[startPoint];
        tabToSwap[startPoint] = tabToSwap[endPoint];
        tabToSwap[endPoint] = valueAtStartPoint;
        return tabToSwap;
    }

    static int[] reverse(int[] tabToReverse, int howManyElementsShouldBeReverted){
      int startPoint = 0;
      int endPoint = howManyElementsShouldBeReverted - 1;
      if(howManyElementsShouldBeReverted == 0){
          return tabToReverse;
      }
      if(howManyElementsShouldBeReverted > tabToReverse.length){
          endPoint = tabToReverse.length - 1;
      }
      while(startPoint < endPoint){
          tabToReverse = swap(tabToReverse, startPoint, endPoint);
          startPoint = startPoint + 1;
          endPoint = endPoint - 1;
      }
      return tabToReverse;
    }
    public static void main(String[] args) {
        int[] tab = {1, 5, 3, 9, 0, 23, 6, 30, 4, 3, 9};
        int numbersToRevert = 0;
        System.out.println(Arrays.toString(reverse(tab, numbersToRevert)));
    }
}

