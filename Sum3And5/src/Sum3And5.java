public class Sum3And5 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        for (int x = 1; x <= 1000 && count <= 5; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("Number is " + x);
                count++;
                sum += x;
            }
        }

        System.out.println("the sum is " + sum);
    }
}
