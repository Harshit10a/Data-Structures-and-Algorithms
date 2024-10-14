public class Demo {
    public static void main(String[] args) {
        String str ="PHYSICS";
        String revesre =" ";
        char ch;
        for (int i = 0; i <str.length() ; i++) {
            ch=str.charAt(i);
            revesre=ch+revesre;
        }
        System.out.println(revesre);

        }
       }


