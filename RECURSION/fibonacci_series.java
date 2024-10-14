public class fibonacci_series {
    public static  int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fib1 = fibo(n - 1);
        int fib2 = fibo(n - 2);
        int fib = fib1 + fib2;
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
