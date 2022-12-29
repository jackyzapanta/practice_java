public class PrimeNumberCounter {

    public static void main(String[] args) {
        int number2check = 20;
        int upperLimit = 50;
        int counter = 1;

        for (int x = number2check; counter <= 3 && x <= upperLimit; x++) {
            if (isPrime (x)) {
                System.out.println("Number " + x + " is a prime #.");
                counter++;
            }
        }
    }

    public  static  boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int x = 2; x < wholeNumber; x++) {
            if (wholeNumber % x == 0) {
                return false;
            }
        }
        return true;
    }

}
