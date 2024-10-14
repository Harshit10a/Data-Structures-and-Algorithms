public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String str="the sky is blue";
        String rev="";

        for (int i = 0; i <str.length() ; i++)
        {
            StringBuilder sb =new StringBuilder();
            while(i<str.length()&&str.charAt(i)!=' '){
                sb.append(str.charAt(i));
                i++;
            }
            if(sb.length()!=0){
                rev=" "+sb+rev;
            }
        }
        System.out.println(rev.substring(1));
    }
}
