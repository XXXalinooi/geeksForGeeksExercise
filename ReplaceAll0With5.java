import java.util.ArrayList;

public class ReplaceAll0With5 {
    public static int replaceAll0With5(int numberToCheck){
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(numberToCheck>0){
            arrayList.add(numberToCheck%10);
            numberToCheck = numberToCheck/10;
        }
        for(int j=0; j<arrayList.size(); j++){
            if(arrayList.get(j) == 0){
                arrayList.remove(j);
                arrayList.add(j, 5);
            }
        }
        int result=0;
        for(int i = 0; i<arrayList.size(); i++){
            result = (int) (result + arrayList.get(i)*Math.pow(10, i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceAll0With5(20080062));
    }
}
