import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "egg"; String t = "add";
        HashMap<Character,Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch)!=tch) System.out.println("False");
            }
            else if(mp.containsValue(tch))System.out.println("False");
            else mp.put(sch,tch);
        }
        System.out.println("true");
    }
}
