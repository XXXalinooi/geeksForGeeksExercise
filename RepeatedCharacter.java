import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {
    public static char repeatedCharacter(String s){
        char[] arr = s.toCharArray();
        Map<Character, Boolean> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], true);
            }
            else{
                map.put(arr[i], false);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]).equals(true)){
                return arr[i];
            }
        }
        return '#';
    }
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("ABCDEF"));
    }
}
