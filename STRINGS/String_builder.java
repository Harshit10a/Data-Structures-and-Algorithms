public class String_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            str.append(ch);
        }
        System.out.println(str);
        System.out.println(str.length());
    }
}
