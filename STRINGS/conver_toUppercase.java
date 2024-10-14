public class conver_toUppercase {
    public static String uppercase(String user) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(user.charAt(0));
        sb.append(ch);
        for (int i = 1; i < user.length(); i++) {
            if (user.charAt(i) == ' '&& i < user.length() - 1) {
                sb.append(user.charAt(i));
                i++;
                sb.append(Character.toUpperCase(user.charAt(i)));
            } else sb.append(user.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am harshit shrivastava";
        System.out.println(uppercase(str));
    }
}
