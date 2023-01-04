public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,4)); //false
        System.out.println(canPack(1,0,5)); //true
        System.out.println(canPack(0,5,4)); //true
        System.out.println(canPack(2,2,11)); //true
        System.out.println(canPack(-3,2,12)); //false
        System.out.println(canPack(2,1,5)); //true
        System.out.println(canPack(4,18,19)); //true
        System.out.println(canPack(5,3,24)); //false
        System.out.println(canPack(6,2,17)); //true
        System.out.println(canPack(1,0,6)); //false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int bagDifference;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        bagDifference = ((bigCount * 5) + smallCount ) - goal;

        if (bigCount > 0) {
            if ((goal / (bigCount * 5)) > 0 && bagDifference >= 0) {
                return true;
            } else if ((bigCount * 5) % goal == 0 && bagDifference >= 0) {
                return true;
            } else if ((bigCount * 5) % goal == 1 && bagDifference >= 0 && smallCount > 0
             && ((bigCount * 5) + smallCount) % goal == 0) {
                return true;
            } else {
                int totalBag = (bigCount * 5 + smallCount) % goal;
                return totalBag % 5 == 0 && (bigCount * 5) > goal;
            }
        } else {
            return bagDifference >= 0;
        }
    }
}
