public class Function_overloading {
    static class calculator{
        int sum(int a,int b) {
            return a+b;
        }
        float sum(float a,float b) {
            return a+b;
        }
    }

    public static void main(String[] args) {
     calculator c1=new calculator();
        System.out.println(c1.sum(5,6));

    }
}
