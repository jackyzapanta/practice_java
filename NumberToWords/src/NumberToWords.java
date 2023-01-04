public class NumberToWords {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-1));
//        System.out.println(getDigitCount(5200));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        System.out.println(reverse(5200));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {

        int reverseNumber, digitCount, reminder, divisor;
        String wordedNumber ="";

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        reverseNumber = reverse(number);
        digitCount = getDigitCount(number);

        for (int x = 1; x <= digitCount; x++){

            reminder = reverseNumber % 10;
            divisor = reverseNumber / 10;
            reverseNumber = divisor;

                switch ( reminder ) {
                    case 1: wordedNumber += "One "; break;
                    case 2: wordedNumber += "Two "; break;
                    case 3: wordedNumber += "Three "; break;
                    case 4: wordedNumber += "Four "; break;
                    case 5: wordedNumber += "Five "; break;
                    case 6: wordedNumber += "Six "; break;
                    case 7: wordedNumber += "Seven "; break;
                    case 8: wordedNumber += "Eight "; break;
                    case 9: wordedNumber += "Nine "; break;
                    default: wordedNumber += "Zero "; break;
                }
            }
        System.out.println(wordedNumber);
        }

    public static int reverse(int number) {
        int divisor, reminder, processedNum =0;
        String reverseNumber ="";
        boolean isNegative = false;

        processedNum = number;
        if (processedNum < 0) {
            processedNum *= -1;
            isNegative = true;
        }

        do {
            reminder = processedNum % 10;
            divisor = processedNum / 10;
            processedNum = divisor;
            reverseNumber += Integer.toString(reminder);
        }while (divisor != 0);

        if (isNegative) {
            return Integer.parseInt(reverseNumber) * -1;
        }
        else {
            return Integer.parseInt(reverseNumber);
        }
    }

    public static int getDigitCount(int number) {
        int divisor, digitCount = 0;

        if (number < 0) {
            return -1;
        }
        do {
            divisor = number / 10;
            number = divisor;
            digitCount++;
        } while (divisor != 0);
        return digitCount;
    }
}
