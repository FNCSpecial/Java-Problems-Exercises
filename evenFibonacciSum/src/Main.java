public class Main {
    static Integer evenFibonacciSum(Integer n) {

        int wynik=0;
        int fib;
        int prevprev = 0;
        int prev = 1;

        while(wynik <= n){
            fib = prevprev + prev;
            prevprev = prev;
            prev = fib;

            if(fib % 2 == 0 ){
                if(wynik + fib < n ) {
                    wynik += fib;
                }
                else {
                    break;
                }
            }

        }



        return wynik;

    }
    public static void main(String[] args) {
        System.out.println(evenFibonacciSum(5));
        System.out.println(evenFibonacciSum(2));
        System.out.println(evenFibonacciSum(21));
        System.out.println(evenFibonacciSum(51));
    }
}