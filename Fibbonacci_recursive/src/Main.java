public class Main {
    static int fibonacci_recursive(int n)
    {
        if (n <= 1)
            return n;
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci_recursive(4));
        System.out.println(fibonacci_recursive(5));
    }
}