import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {
    static void swap(char[]arrayToSwap, int firstIndex, int lastIndex){
        char letterAtFirstIndeks = arrayToSwap[firstIndex];
        arrayToSwap[firstIndex] = arrayToSwap[lastIndex];
        arrayToSwap[lastIndex] = letterAtFirstIndeks;
    }
    static char[] swapSecondWay(char[]arrayToSwap, int firstIndex, int lastIndex){
        char letterAtFirstIndex = arrayToSwap[firstIndex];
        arrayToSwap[firstIndex] = arrayToSwap[lastIndex];
        arrayToSwap[lastIndex] = letterAtFirstIndex;
        firstIndex = firstIndex +1;
        lastIndex = lastIndex - 1;
        if(firstIndex != lastIndex && firstIndex != (lastIndex + 1)){
            swapSecondWay(arrayToSwap, firstIndex, lastIndex);
        }
        return arrayToSwap;
    }
    static String reverse(String givenString){
        if(givenString.length() == 1) {
            return givenString;
        }
       char[] givenStringArray = givenString.toCharArray();
       int firstLetterIndex = 0;
       int lastLetterIndex = givenStringArray.length - 1;
       while(firstLetterIndex != lastLetterIndex && firstLetterIndex != (lastLetterIndex + 1)){
           swap(givenStringArray, firstLetterIndex, lastLetterIndex);
           firstLetterIndex = firstLetterIndex +1;
           lastLetterIndex = lastLetterIndex -1;
       }
       return String.valueOf(givenStringArray);
    }

    static String reverseSecondWay(String givenString){
        if(givenString.length() == 1) {
            return givenString;
        }
        char[] givenStringArray = givenString.toCharArray();
        int firstLetterIndex = 0;
        int lastLetterIndex = givenStringArray.length - 1;
        char[] result = swapSecondWay(givenStringArray, firstLetterIndex, lastLetterIndex);
        return String.valueOf(result);
    }

    public static String reverseThirdWay(String string) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i += 1) {
            stack.push(string.charAt(i));
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("dzień dobry"));
        System.out.println(reverseSecondWay("dzień dobry"));
        System.out.println(reverseThirdWay("dzień dobry"));
    }
}
