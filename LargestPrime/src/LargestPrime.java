public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (21)); //7
        System.out.println(getLargestPrime (217)); //31
//        System.out.println(getLargestPrime (0)); //-1
        System.out.println(getLargestPrime (45)); //5
//        System.out.println(getLargestPrime (-1)); //-1
        System.out.println(getLargestPrime (7)); //7
        System.out.println(getLargestPrime (31)); //31
        System.out.println(getLargestPrime (16)); //2
    }

    public  static int getLargestPrime(int number) {
        int largestPrime = 0, tmpprime;
        if (number < 2) {
            return -1;
        }

        for (int x = 2; x <= number; x++){
            if (number % x == 0){
                tmpprime = number / x;
                if (tmpprime % x == 0 && (tmpprime / x) > largestPrime){
                    largestPrime = tmpprime / x;
                    if (largestPrime % x == 0 ){
                        largestPrime = largestPrime / x;
                    }
                    break;
                } else {
                    if(tmpprime > largestPrime) {
                        largestPrime = number / x;
                    }
                    if (number == x && largestPrime == tmpprime){
                        largestPrime = x;
                    }
                }
            }
        }
        return  largestPrime;
    }
}
