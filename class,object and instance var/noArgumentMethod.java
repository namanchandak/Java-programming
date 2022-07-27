public class noArgumentMethod {
    int a,b,c;
    void show()
    {
        System.out.println(a+"  "+b+"   "+c);
    }
    public static void main(String[] args) {
        noArgumentMethod o1=new noArgumentMethod();
        noArgumentMethod o2=new noArgumentMethod();
o1.a=10;
o1.b=20;
o1.c=30;
o2.a=123;
o2.b=1234;
o2.c=6543;
o1.show();
o2.show();
    }
}
