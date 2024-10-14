public class Reverse_String {
    public static String reverse(String user){
        String reverse="";
        for(int i=user.length()-1;i>=0;i--){
            reverse= reverse+(user.charAt(i));
        }
        return reverse;
    }
    public static void main(String[] args) {
        String name="HARSHIT";
        System.out.println(reverse(name));
    }
}
