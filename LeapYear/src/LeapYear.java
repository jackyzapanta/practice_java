public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(1800));
    }

    public static  boolean isLeapYear(int year)
    {
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
        return  isValid;
    }
}
