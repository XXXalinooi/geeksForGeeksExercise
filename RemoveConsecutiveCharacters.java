public class RemoveConsecutiveCharacters {
    public static String removeConsecutiveCharacters(String s1){
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < s1.length()-1; i++){
            if(s1.charAt(i) != s1.charAt(i+1)){
                s2.append(s1.charAt(i));
            }
        }
        s2.append(s1.charAt(s1.length()-1));
        return s2.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeConsecutiveCharacters("aabaaaaal"));
    }
}
