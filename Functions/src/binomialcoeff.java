import java.util.Scanner;

public class binomialcoeff {
    public static int fact(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static int bincoff(int N, int R) {
        int n_factorial = fact(N);
        int r_factorial = fact(R);
        int n_r_factorial = fact(N - R);
        int bini = n_factorial / (r_factorial * n_r_factorial);
        return bini;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        System.out.println("Enter the value of R");
        int R = sc.nextInt();
        System.out.println(bincoff(N, R));


    }
}
