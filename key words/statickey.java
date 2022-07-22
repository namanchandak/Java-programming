public class statickey {
    static int a;
    public static void main(String[] args) {
        statickey o1=new statickey();
        statickey o2=new statickey();
        statickey o3=new statickey();
        o1.a=10;
        o2.a=20;
        o3.a=144;
        System.out.print(o1.a);
        System.out.print(o2.a);
        System.out.print(o3.a);
        System.out.print(a);
        System.out.print(statickey.a);

    }
}
