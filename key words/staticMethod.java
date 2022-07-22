public class staticMethod {
    static int a;
    static void show()
    {
        System.out.print(a);
    }
    public static void main(String[] args) {
        staticMethod o1=new staticMethod();
        System.out.println(a);
        System.out.print(o1.a);
    }
}
