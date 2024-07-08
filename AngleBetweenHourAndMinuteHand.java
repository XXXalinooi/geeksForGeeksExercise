public class AngleBetweenHourAndMinuteHand {
    public static int angleBetweenHans(int hour, int minute){
        if(minute >= 60 || hour > 12){
            System.out.println("Nieprawidlowe dane wejsciowe");
            return -1;
        }
        if(hour == 12){
            hour = 0;
        }
        int minuteDegrees = minute*6;
        int hourDegrees = (hour*30)+minute/2;
        int result = Math.abs(hourDegrees - minuteDegrees);
        if(result <= 180){
            return result;
        }
        else{
            return 360 - result;
        }
    }

    public static void main(String[] args) {
        System.out.println(angleBetweenHans(9, 0));
        System.out.println(angleBetweenHans(3, 30));
        System.out.println(angleBetweenHans(2, 14));
    }
}
