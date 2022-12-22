public class SecondClass {

    public static void main(String[] args) {

        double firstValue = 20.00,
                secondvalue = 80.00,
                sumValue = 0.00 ;

        sumValue = ( firstValue + secondvalue ) * 100;

        boolean hasRemainder = sumValue % 40.00 == 0;

        System.out.println(hasRemainder);

        if (!hasRemainder)
        {
            System.out.println("got some remainder.");
        }
    }
}
