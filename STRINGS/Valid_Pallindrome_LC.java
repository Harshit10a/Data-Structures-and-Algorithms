public class Valid_Pallindrome_LC {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str=str.toLowerCase();
       StringBuilder sb =new StringBuilder();
        for (int i=0;i<str.length();i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        int n=sb.length()-1;
        for (int i = 0; i <sb.length()/2 ; i++) {
            if(sb.charAt(i)!=sb.charAt(n-i)){
                System.out.println("Not A pallindrome");
            }
        }
        System.out.println("A pallindrome");
    }
}
