public class pattern1 {
    public static void main(String[] args) {
        int n = 6;
        char ch = 'A';
        for (int line = 1; line <= 6; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
