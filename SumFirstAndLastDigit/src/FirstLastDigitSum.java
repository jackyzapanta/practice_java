public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstnumber, lastnumber = 0, divisor, counter = 0, reminder;

        if (number < 0) {
            return -1;
        }

        do {
            counter++;
            reminder = number % 10;
            divisor = number / 10;
            firstnumber = number;
            if (counter == 1) {
                lastnumber = reminder;
            }
            number = divisor;

        } while (divisor != 0);

        return firstnumber + lastnumber;
    }
}
