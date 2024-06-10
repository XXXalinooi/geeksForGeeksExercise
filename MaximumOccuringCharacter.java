import java.util.*;

public class MaximumOccuringCharacter {
    public static char maximumOccuringCharacterSecondWay(String s1){
        List<Character> s2 = new ArrayList<>();
        for(int i = 0; i < s1.length(); i++){
            s2.add(s1.charAt(i));
        }
        Collections.sort(s2);
        int maxOcc = 1;
        int temp = 0;
        char tempChar = s2.get(0);
        char maxChar = s2.get(0);
        for(int i = 0; i<s2.size(); i++){
            if(tempChar == s2.get(i)){
                temp = temp + 1;
            }
            else{
                tempChar = s2.get(i);
                temp = 1;
            }
            if(temp > maxOcc){
                maxOcc = temp;
                maxChar = s2.get(i);
            }
        }
        System.out.println("znak " + maxChar + " wystapil " + maxOcc + " razy");
        return maxChar;
    }
    public static char maximumOccuringCharacterFirstWay(String s1){
        Map<Character, Integer> map = new HashMap<>();
        int maxOcc = 1;
        int value = 1;
        char maxChar = s1.charAt(0);
        for(int i = 0; i<s1.length(); i++){
            if(!map.containsKey(s1.charAt(i))){
               map.put(s1.charAt(i), 1);
            }
            else {
                value = map.get(s1.charAt(i));
                value = value + 1;
                map.put(s1.charAt(i), value);
            }
            if(maxOcc < value){
                maxOcc = value;
                maxChar = s1.charAt(i);
            }
        }
        System.out.println("znak " + maxChar + " wystapil " + maxOcc + " razy");
        return maxChar;
    }
    public static void main(String[] args) {
        maximumOccuringCharacterFirstWay("edukacja");
        maximumOccuringCharacterSecondWay("edukacja");
    }
}
