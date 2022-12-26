public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int value1, int value2, int value3) {
        if (value1 < 0 || value2 < 0 || value3 < 0) {
            System.out.println("Invalid Value");
        } else if (value2 == value3 && value3 == value1) {
            System.out.println("All numbers are equal");
        } else if (value1 == value2 || value2 == value3 || value3 == value1) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
