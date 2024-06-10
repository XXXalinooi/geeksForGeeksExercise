import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArmstrongNumbers {
    public static int powerFirstWay(int number, int exponent){
        int result = 1;
        if(exponent == 0){
            return 1;
        }
        while(exponent > 0){
            result = result*number;
            exponent = exponent-1;
        }
        return result;
    }

    public static int powerSecondWay(int number, int exponent){
        if(exponent == 0){
            return 1;
        }
        if(number == 0){
            return 0;
        }
        exponent = exponent-1;
        return number*(powerSecondWay(number, exponent));
    }

    public static int getNextDigit(int number){
        return number%10;
    }

    public static ArrayList<Integer> createArrayOfDigits(int numberToSeparate){
        ArrayList<Integer> list = new ArrayList<>();
        while(numberToSeparate > 0){
            list.add(getNextDigit(numberToSeparate));
            numberToSeparate = numberToSeparate/10;
        }
        return list;
    }

    public static boolean isNumberAnArmstrongNumber(int numberToCheck){
        ArrayList<Integer>tempList = createArrayOfDigits(numberToCheck);
        int sum = 0;
        for(int i=0; i<tempList.size(); i++){
            sum = (sum + powerFirstWay(tempList.get(i), tempList.size()));
        }
        return numberToCheck == sum;
    }

    public static void main(String[] args){
       System.out.print(isNumberAnArmstrongNumber(1634));
       System.out.print(isNumberAnArmstrongNumber(153));
       System.out.print(powerSecondWay(2, 3));
    }
}
