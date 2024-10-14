public class remove_duplicates_string {
    public static void remove(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            ;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            remove(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            remove(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String name = "Helloharshit";
        remove(name, 0, new StringBuilder(""), new boolean[26]);
    }
}
