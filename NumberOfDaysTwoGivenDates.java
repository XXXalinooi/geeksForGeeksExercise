public class NumberOfDaysTwoGivenDates {

    public static int getNumberOfDaysInMonth(int month, int year){
        if(month > 12 || month < 1){
            return -1;
        }
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                if(year%4==0){
                    return 29;
                }
                else return 28;
        }
    }

    public static int getNumberOfDaysInYears(int startYear, int endYear){
        int sumOfDays = 0;
        for(int i = startYear; i < endYear; i++){
            if(i%4 == 0){
                sumOfDays = sumOfDays +366;
            }
            else sumOfDays = sumOfDays +365;
        }
        return sumOfDays;
    }

    public static int getNumberOfDaysStartMonth(int month, int year){
        int numberOfDays =0;
        for(int i = 12; i>month; i--){
            numberOfDays = numberOfDays + getNumberOfDaysInMonth(i, year);
        }
        return numberOfDays;
    }

    public static int getNumberOfDaysEndMonth(int month, int year){
        int numberOfDays =0;
        for(int i = 1; i<month; i++){
            numberOfDays = numberOfDays + getNumberOfDaysInMonth(i, year);
        }
        return numberOfDays;
    }

    public static int getNumberOfDaysStartDate(int days, int month, int year){
        return getNumberOfDaysInMonth(month, year) - days;
    }

    public static int calculateNumberOfDaysTwoGivenDates(int startDay, int startMonth, int startYear,
                                                         int endDay, int endMonth, int endYear){
        return getNumberOfDaysInYears(startYear+1, endYear) + getNumberOfDaysStartMonth(startMonth, startYear) +
                getNumberOfDaysEndMonth(endMonth, endYear) + getNumberOfDaysStartDate(startDay, startMonth, startYear) +
                + endDay;
    }

    public static void main(String[] args) {
        System.out.println(calculateNumberOfDaysTwoGivenDates(
                10, 2, 2001,
                10, 2, 2002 ));

        System.out.println(calculateNumberOfDaysTwoGivenDates(
                10, 2, 2014,
                10, 3, 2015 ));
    }
}
