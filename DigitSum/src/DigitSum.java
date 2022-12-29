public class DigitSum {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 5;
        int value = 1;
        int divisor, valueQuo;
        int valuedesc = value;

        do {
            divisor = (int) Math.pow(10,counter);
            valueQuo = value / divisor;
            if (valueQuo > 0) {
                sum += valueQuo;
                value -= valueQuo * divisor;
            }
        counter--;
        } while (counter >= 0);
        System.out.println("the sum of " + valuedesc + " is " + sum);
    }


}
