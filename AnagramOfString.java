import java.util.HashMap;
import java.util.Map;

public class AnagramOfString {
    public static int anagramOfString(String s1, String s2){
        Map<Character, Integer> s1map = new HashMap<>();
        Map<Character, Integer> s2map = new HashMap<>();
        int result = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1map.containsKey(s1.charAt(i))){
                int value = s1map.get(s1.charAt(i));
                s1map.put(s1.charAt(i), value+1);
            }
            else{
                s1map.put(s1.charAt(i), 1);
            }
        }
        for(int i = 0; i < s2.length(); i++){
            if(s2map.containsKey(s2.charAt(i))){
                int value = s2map.get(s2.charAt(i));
                s2map.put(s2.charAt(i), value+1);
            }
            else{
                s2map.put(s2.charAt(i), 1);
            }
        }
        for(int j = 0; j<s1.length(); j++){
            if(s2map.containsKey(s1.charAt(j))){
                int val = s2map.get(s1.charAt(j));
                if(val == 1){
                    s2map.remove(s1.charAt(j));
                }
                else{
                    val = val-1;
                    s2map.put(s1.charAt(j), val);
                }
            }
            else{
                result = result +1;
            }
        }
        for(int j = 0; j<s2.length(); j++){
            if(s1map.containsKey(s2.charAt(j))){
                int val = s1map.get(s2.charAt(j));
                if(val == 1){
                    s1map.remove(s2.charAt(j));
                }
                else{
                    val = val-1;
                    s1map.put(s2.charAt(j), val);
                }
            }
            else{
                result = result +1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(anagramOfString("cddgk", "gcd"));
    }
}
