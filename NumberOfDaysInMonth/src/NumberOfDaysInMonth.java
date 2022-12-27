public class NumberOfDaysInMonth {
    public static void main(String[] args) {
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
//        System.out.println(isLeapYear(9000));
        System.out.println(getDaysInMonth(1, 2000));
        System.out.println(getDaysInMonth(2, 2000));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2000));
        System.out.println(getDaysInMonth(1, -2000));
    }

    public static boolean isLeapYear(int year) {
        boolean isValid = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 ) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isValid = true;
                    }
                } else {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
// conventional switch
        switch (month){
            case 4: case 6: case 9: case 11:
                return 30;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            default:
                if (isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
        }
// enhanced switch
//        return switch (month){
//            case 4, 6, 9, 11 -> 30;
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            default -> {
//                if (isLeapYear(year)){
//                    yield 29;
//                } else {
//                    yield 28;
//                }
//            }
//        };
    }
}
