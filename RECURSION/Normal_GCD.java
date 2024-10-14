public class Normal_GCD {
    public static int greatestcommon(int n, int k) {
        while (n % k != 0) {
            int rem = n % k;
            n = k;
            k = rem;
        }
        return k;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 24;
        System.out.println(greatestcommon(num1, num2));
    }
}
