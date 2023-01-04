public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int leastnum, commonFactor = 0;

        if (first < 10 || second < 10) {
            return -1;
        }

        leastnum = second;
        if (first < second) {
            leastnum = first;
        }

        for (int x = 1; x <= leastnum; x++){

            if ( first % x == 0 && second % x == 0) {
                commonFactor = x;
            }
        }
        return commonFactor;
    }
}
