public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number){
        int count = 1;

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        while (count <= number){
            if (number % count == 0) {
                System.out.print(count + " ");
            }
            count++;
        }
        System.out.println();
    }
}
