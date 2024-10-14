public class LCM {
    public static int great(int x, int y) {
        if (y == 0) {
            return x;
        }
        return great(y, x % y);
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 24;
        System.out.println("HCF of numbers = " + great(num1, num2));
        System.out.println("LCM of numbers = " + (num1 * num2) / great(num1, num2));

    }
}
