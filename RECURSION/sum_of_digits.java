public class sum_of_digits {
    public static int sum(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        int new_no = sum(n / 10);
        int sums = new_no + (n % 10);
        return sums;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(sum(num));
    }
}
