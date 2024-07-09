public class CheckForSubsequence {
    public static String checkForSubsequence(String s1, String s2){
        if(s1.length() > s2.length()){
            return "Inappropriate input data";
        }
        for(int i =0, j=0; i<s2.length(); i++){
            if(j == s1.length()-1 && s2.charAt(i) == s1.charAt(j)){
                return "Subsequence found!";
            }
            if (s2.charAt(i) == s1.charAt(j)) {
                j = j+1;
            }
        }
        return "Did not found subsequence!";
    }

    public static void main(String[] args) {
        System.out.println(checkForSubsequence("AXY", "YADXCP"));
        System.out.println(checkForSubsequence("DCP", "YADXCP"));

    }
}
