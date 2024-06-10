import java.util.ArrayList;

public class ReverseNumber {

    static public int reverseNumber(int number){
        ArrayList<Integer> a = new ArrayList<>();
        int k = number%10;
        int result = 0;
        while(k == 0){
            number = number/10;
            k = number%10;
        }
        while (number >0){
           int n = number%10;
           a.add(n);
           number = number/10;
        }
        for(int i = 0; i<a.size(); i++){
            result = (int) (result+a.get(a.size()-i-1)*Math.pow(10, i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(2002));
    }
}
