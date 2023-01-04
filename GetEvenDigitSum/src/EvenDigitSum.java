public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int reminder, divisor, evensum = 0;

        if (number < 0) {
            return -1;
        }

        do {
            reminder = number % 10;
            divisor = number / 10;

            if (reminder % 2 == 0) {
                evensum += reminder;
            }
            number = divisor;
        } while (divisor != 0);

        return evensum;
    }
}
