public class hollow_rectangle_pattern {
    public static void hollw_pattern(int rows,int colms){
        for (int i = 1; i<=rows ; i++) {
            for(int j=1;j<=colms;j++){
                if(i==1||i==rows||j==1||j==colms){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");}
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
hollw_pattern(5,5);
    }
}
