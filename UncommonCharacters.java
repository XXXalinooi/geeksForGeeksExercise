import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UncommonCharacters {
    public static String uncommonCharacters(String s1, String s2){
        Set<Character> setS1 = new HashSet<>();
        Set<Character> setS2 = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i=0; i<s1.length(); i++){
            setS1.add(s1.charAt(i));
        }
        for(int i=0; i<s2.length(); i++){
            if(!setS1.contains(s2.charAt(i))){
                result.append(s2.charAt(i));
            }
        }
        for (int i=0; i<s2.length(); i++){
            setS2.add(s2.charAt(i));
        }
        for(int i=0; i<s1.length(); i++){
            if(!setS2.contains(s1.charAt(i))){
                result.append(s1.charAt(i));
            }
        }
        char[] charArray = result.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(uncommonCharacters("geeksforgeeks", "geeksquiz"));
    }
}
