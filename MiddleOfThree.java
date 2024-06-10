import java.util.PriorityQueue;

public class MiddleOfThree {
    public static int middleOfThreeFirstWay(int first, int second, int third){
        if((first <= second && first >= third) || (first > second && first <= third)){
            return first;
        }
        else if((second >= first && second <= third) || (second <= first && second >= third)){
            return second;
        }
        else{
            return third;
        }
    }

    public static int middleOfThreeSecondWay(int first, int second, int third){
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        que1.add(first);
        que1.add(second);
        que1.add(third);

        que1.poll();
        return que1.peek();
    }

    public static void main(String[] args) {
        System.out.println(middleOfThreeSecondWay(24, 44, 11));
    }
}
