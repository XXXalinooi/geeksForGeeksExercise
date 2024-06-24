import java.util.HashSet;
import java.util.Set;

public class StringIsogram {

    public static boolean checkIfStringIsIsogram(String s){
        Set<Character> letters = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            if(!letters.add(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfStringIsIsogram("Dog"));
        System.out.println(checkIfStringIsIsogram("Screen"));
        System.out.println(checkIfStringIsIsogram("Notebook"));
        System.out.print(checkIfStringIsIsogram("Picture"));
    }
}
