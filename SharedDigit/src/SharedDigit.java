public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstnumber, int secondnumber) {
        boolean hasShared = false, hasfound = false;
        int firstreminder = 0, firstdivisor = 0, secondreminder = 0, seconddivisor, processednumber;

        if (firstnumber >= 10 && firstnumber <= 99
            && secondnumber >= 10 && secondnumber <= 99) {

            do {
                firstreminder = firstnumber % 10;

                processednumber = secondnumber;
                do {
                    secondreminder = processednumber % 10;

                    if (firstreminder == secondreminder) {
                        hasfound = true;
                    }
                    seconddivisor = processednumber / 10;
                    processednumber = seconddivisor;
                } while (seconddivisor != 0 && !hasfound);

                firstdivisor = firstnumber / 10;
                firstnumber = firstdivisor;

            } while (!hasfound && firstdivisor != 0);
            hasShared = hasfound;
        }
        return hasShared;
    }
}
