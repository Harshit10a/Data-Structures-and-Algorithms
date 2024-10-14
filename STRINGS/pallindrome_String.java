public class pallindrome_String {
    public static boolean check(String user) {
        int n = user.length();
        for (int i = 0; i < user.length() / 2; i++) {
            if (user.charAt(i) != user.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "java";
        System.out.println( check(str));
    }
}
