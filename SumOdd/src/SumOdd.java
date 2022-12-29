public class SumOdd {


    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(1,11));

    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start > 0 && end > 0 && start <= end) {
            for (int x = start; x <= end; x++) {
                if (isOdd(x)){
                    sum += x;
                }
            }
            return sum;
        }
        else {
            return -1;
        }
    }

    public  static boolean isOdd (int number) {
        boolean isValid = false;

        if (number > 0 && number % 2 != 0)
        {
            isValid = true;
        }
        return  isValid;
    }
}
