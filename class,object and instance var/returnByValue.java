public class returnByValue {
    int add(int a,int b)
    {int c;
        c=a+b;

        return c;
    }
    public static void main(String[] args) {
        returnByValue o=new returnByValue();
        int c=o.add(100, 200);
        int d=o.add(10, 200);
        System.out.println(c);
        System.out.println(d);
        System.out.print(o.add(50, 40));
    }
}
