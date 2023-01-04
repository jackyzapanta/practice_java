public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        int sumOfNumber = 0;

        if (number < 1) {
            return false;
        }

        for (int x = 1; x < number; x++) {
            if (number % x == 0) {
                sumOfNumber += x;
            }
        }

        return sumOfNumber == number;
    }
}
