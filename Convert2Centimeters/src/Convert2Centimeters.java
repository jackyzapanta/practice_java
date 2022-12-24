public class Convert2Centimeters {

    public static void main(String[] args) {
        System.out.println("First call: " + convertToCentimeters(68) + " cm");
        System.out.println("Second call: " + convertToCentimeters(5,8) + " cm");
    }

    public static  double convertToCentimeters(int valueInches) {
        return (double) valueInches * 2.54;
    }

    public  static  double convertToCentimeters(int valueFeet, int valueInches) {
        double convertedValue = (double) (valueFeet * 12) + valueInches;
        return convertToCentimeters((int)convertedValue);
        //another way
        //return convertToCentimeters((valueFeet * 12) + valueInches);
    }

}
