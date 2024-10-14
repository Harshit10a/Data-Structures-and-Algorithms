public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (n - line + 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
