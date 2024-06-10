import java.util.ArrayList;

public class FindPositionOfSetBit {
    public static ArrayList<Integer> convertToByteArr(int n){
        ArrayList<Integer> listOfBytes = new ArrayList<>();
        while (n > 0){
            int k = n%2;
            listOfBytes.add(k);
            n = n/2;
        }
        return listOfBytes;
    }

    public static int findIndexOfOneArr(ArrayList<Integer> arr){
        if(!arr.contains(1)){
            return -1;
        }
        int index = 0;
        while(arr.get(index)!=1){
            index = index+1;
        }
        int index2 = index;
        while(index2<arr.size()-1){
            if(arr.get(index2+1)==1)
            {
                return -1;
            }
            index2 = index2+1;
        }
       return index+1;
    }

    public static int findIndexOfOne(int n){
        return findIndexOfOneArr(convertToByteArr(n));
    }

    public static void main(String[] args) {
        System.out.println(findIndexOfOne(10));
    }
}
