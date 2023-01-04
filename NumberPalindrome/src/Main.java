public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        boolean ispalindrome = false;
        int reminder, divisor, convertednumber;
        String reverse = "";

        convertednumber = number;
        if (convertednumber < 0) {
            convertednumber *= -1;
        }

        do {
            reminder = convertednumber % 10;
            divisor = convertednumber / 10;

            reverse = reverse + Integer.toString(reminder);
            convertednumber = divisor;

        } while (divisor != 0);

        convertednumber = number;
        if (convertednumber < 0) {
            convertednumber *= -1;
        }

        if (convertednumber == Integer.parseInt(reverse)) {
            ispalindrome = true;
        }
        return ispalindrome;
    }

}
