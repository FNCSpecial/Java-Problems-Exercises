public class Main {

    static  int fibonacci(Integer n){
        int wynik=0;
        int prevprev = 0;
        int prev = 1;

        for( int i = 1 ; i < n ; i ++ ){
            wynik = prevprev + prev;
            prevprev = prev;
            prev = wynik;
        }
        return wynik;


    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}