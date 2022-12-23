public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        float roundedValue;

        roundedValue =  kilometersPerHour < 0 ? -1 : (float) ( kilometersPerHour / 1.609 ) ;
        return Math.round(roundedValue);
    }

    public static  void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h" );
        }
    }
}
