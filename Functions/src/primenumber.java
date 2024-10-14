import java.util.Scanner;

public class primenumber {
    public static boolean prime(int n) {
        boolean isprime = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe to be checked ");
        int N = sc.nextInt();
        System.out.println(prime(N));

    }
}
