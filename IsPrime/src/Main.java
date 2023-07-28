public class Main {
    static Boolean isPrime(Integer n) {

        if (n <= 1 ) {
            return false;
        }
        else {
            for (int i = n - 1; i >= 2; i--) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(7));
        System.out.println(isPrime(5));
        System.out.println(isPrime(0));
        System.out.println(isPrime(21));
    }
}