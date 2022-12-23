public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int number1, int number2, int number3) {
        return number1 + number2 == number3;

    }
}
