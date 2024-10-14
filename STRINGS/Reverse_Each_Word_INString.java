public class Reverse_Each_Word_INString {
    public static void main(String[] args) {
        String str = "olleH siht edis tihsraH avatsavirhS";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans = ans + sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
