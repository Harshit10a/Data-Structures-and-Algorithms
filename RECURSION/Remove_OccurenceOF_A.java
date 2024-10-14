public class Remove_OccurenceOF_A {
    public static String remove(String str, int idx) {
        if (idx == str.length()) return "";

        String small = remove(str, idx + 1);
        char curr = str.charAt(idx);
        if (curr == 'a') {
            return small;
        } else return curr + small;

    }

    public static void main(String[] args) {
        String user = "aebacadahak";
        System.out.println(remove(user, 0));
    }
}
