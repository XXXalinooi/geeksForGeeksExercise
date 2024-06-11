import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class RemoveCommonCharactersAndConcatenate {
    public static String concatenatedString(String s1, String s2){
        Set<Character> s1Set = new HashSet<>();
        Set<Character> s2Set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<s1.length(); i++){
            s1Set.add(s1.charAt(i));
        }
        for(int i = 0; i<s2.length(); i++){
            s2Set.add(s2.charAt(i));
        }
        for(int i = 0; i<s1.length(); i++){
            if(!s2Set.contains(s1.charAt(i))){
                result.append(s1.charAt(i));
            }
        }
        for(int i = 0; i<s2.length(); i++){
            if(!s1Set.contains(s2.charAt(i))){
                result.append(s2.charAt(i));
            }
        }
        if(result.isEmpty()){
            return "-1";
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenatedString("ala", "ala"));
    }
}
