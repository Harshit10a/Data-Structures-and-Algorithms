public class Pallinrome_String {
    public static String pallin(String str, int idx) {
        if (idx == str.length()) return "";
        String smallans = pallin(str, idx + 1);
        return smallans + str.charAt(idx);

    }

    public static void main(String[] args) {
        String user = "DAD";
        String rev = pallin(user, 0);
        if (rev.equals(user)) {
            System.out.println("Pallindrome String ");
        } else System.out.println("Not a Pallindrome String ");
    }
}
