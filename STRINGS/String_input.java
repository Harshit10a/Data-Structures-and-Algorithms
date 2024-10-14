import java.util.Scanner;

public class String_input {
    public static void input(String name)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you Name");
        name=sc.nextLine();
        System.out.println(name+" Good morning Sir ");
    }
    public static void main(String[] args) {
       String username="";
       input(username);
    }
}
