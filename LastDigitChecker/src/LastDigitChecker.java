public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
        System.out.println(hasSameLastDigit (22, 23, 34));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {

        int firstreminder, secondreminder, thirdreminder;

        if (!(isValid(first) && isValid(second) && isValid(third))){
            return false;
        }

        firstreminder = first % 10;
        secondreminder = second % 10;
        thirdreminder = third % 10;

        return firstreminder == thirdreminder || secondreminder == thirdreminder ||
                firstreminder == secondreminder;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
