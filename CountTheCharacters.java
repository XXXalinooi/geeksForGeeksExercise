import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountTheCharacters {

    public static int countTheCharacters(String s1, int N) {
        Set<Character> result = new HashSet<>();
        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) != s1.charAt(i + 1)) {
                if (letters.containsKey(s1.charAt(i))) {
                    int counter = letters.get(s1.charAt(i)) + 1;
                    letters.put(s1.charAt(i), counter);
                } else {
                    letters.put(s1.charAt(i), 1);
                }
            }
        }
            if (letters.containsKey(s1.charAt(s1.length() - 1))) {
                int counter = letters.get(s1.charAt(s1.length() - 1)) + 1;
                letters.put(s1.charAt(s1.length() - 1), counter);
            } else {
                letters.put(s1.charAt(s1.length() - 1), 1);
            }
        for (int i = 0; i < s1.length(); i++) {
                if (letters.get(s1.charAt(i)).equals(N)) {
                    result.add(s1.charAt(i));
                }
        }
        return result.size();
    }


    public static void main(String[] args) {
        System.out.println(countTheCharacters("AABBBABBCC", 1));
        System.out.println(countTheCharacters("AABBBABBCC", 2));
        System.out.println(countTheCharacters("ABCABC", 2));
        System.out.println(countTheCharacters("AAAAA", 2));
        System.out.println(countTheCharacters("geeksforgeeks", 2));
        System.out.println(countTheCharacters("VgeeVksfoVrgeVeksV", 5));
    }
}

