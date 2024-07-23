import java.util.ArrayList;

public class ReverseStringWithSpace {
    public static String reverseStringWithSpace(String s){
        ArrayList<Integer> spaceIndexes = new ArrayList<>();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                spaceIndexes.add(i);
            }
        }
        StringBuilder s1 = new StringBuilder(s);
        for(int i = 0; i<spaceIndexes.size(); i++){
            s1.deleteCharAt(spaceIndexes.get(i) -i);
        }
        s1.reverse();
        for(int i = 0; i< spaceIndexes.size(); i++){
            s1.insert(spaceIndexes.get(i), " ");
        }
        return s1.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStringWithSpace("Ala miala kota"));
    }
}
