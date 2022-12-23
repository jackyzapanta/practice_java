public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(true, 44));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean isDogbarking = false;
        if (barking)
        {
            if  ((hourOfDay > -1 && hourOfDay < 8) || hourOfDay == 23 )  {
                isDogbarking = true;
            }
        }
        return isDogbarking;
    }
}
