public class Reverse_String {
    public static String reverse(String str, int idx) {
        if (idx == str.length() - 1) return "";

        String small = reverse(str, idx + 1);
        return small + str.charAt(idx);
    }

    public static void main(String[] args) {
        String name = "HARSHIT";
        System.out.println(reverse(name, 0));
    }
}
