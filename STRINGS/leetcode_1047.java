public class leetcode_1047 {
    public static String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length()-2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                str.deleteCharAt(1);
                str.deleteCharAt(2);


            }
        }

return str.toString();
    }


    public static void main(String[] args) {
       String user="abbaca";
        System.out.println( removeDuplicates(user));

    }
}
