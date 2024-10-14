import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if(s1.length()!=s2.length()){
            System.out.println("FALSE");
        }
        for (int i = 0; i <s1.length() ; i++) {
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
            } else map1.put(s1.charAt(i),1);
        }
        for (int i = 0; i <s2.length() ; i++) {
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            } else map2.put(s2.charAt(i),1);
        }
        System.out.println(map1.entrySet());
        System.out.println(map2.entrySet());
         if(map1.equals(map2)) System.out.println("True");
        else System.out.println("FALSE");





    }
}
