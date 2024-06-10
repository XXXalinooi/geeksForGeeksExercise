public class FindIfSubstringIsPresent {


    public static void main(String[] args) {
        String str1 = "MagdalenaPrzybylska";
        String str2 = "lena";

        for(int i = 0; i < (str1.length() - str2.length()); i++){
            if(str1.charAt(i) == str2.charAt(0) && str1.startsWith(str2, i)){
                System.out.println("Znaleziono na indeksie " + i);
            }
        }
    }
}
