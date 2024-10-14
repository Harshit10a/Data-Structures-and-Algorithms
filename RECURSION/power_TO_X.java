public class power_TO_X {
    public static int pow(int no, int po) {
        if (no == 0) return 1;

        return no * pow(no, po - 1);
    }

    public static int alternate(int n, int p) {
        if (n == 0) return 1;
        int small = alternate(n, n / 2);
        if (p % 2 == 0) {
            return small * small;
        } else return n * small * small;
    }

    public static void main(String[] args) {
        int num = 2;
        int power = 5;
        System.out.println( alternate(num,power));
    }
}
