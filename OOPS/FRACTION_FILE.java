public class FRACTION_FILE {
    public static fraction add(fraction one ,fraction two){
        int upar=one.num*two.den +two.num*one.den;
        int niche = one.den* two.den;
        fraction three =new fraction(upar,niche);
        return three;
    }
    public static fraction mul(fraction one ,fraction two){
        int upar=one.num*two.num;
        int niche = one.den* two.den;
        fraction three =new fraction(upar,niche);
        return three;
    }
    public static int GCD(int x,int y){
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static  class fraction{
        int num;
        int den;
        public fraction(int num,int den){
            this.num=num;
            this.den=den;
            simplify();
        }

    public  void simplify(){
            int hcf=GCD(num,den);
            num/=hcf;
            den/=hcf;
    }
    }

    public static void main(String[] args) {
        fraction one =new fraction(35,21);
        fraction two =new fraction(7,3);
        System.out.println("Fraction one");
        System.out.println(one.num+"/"+one.den);
        System.out.println("Fraction two");
        System.out.println(two.num+"/"+two.den);
        fraction f3=add(one,two);
        System.out.println("Addition of fraction one and Two ");
        System.out.println(f3.num+"/"+f3.den);
        fraction f4=mul(one,two);
        System.out.println("Multiplication of fraction one and Two ");
        System.out.println(f4.num+"/"+f4.den);

    }
}
