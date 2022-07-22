class a{
    a(int d,int c)
    {
        System.out.println("hello a "+(c+d));
    }
    a(){}
}
class b extends a{
    b(int d, int c,int z)
{ super(c,d);
    System.out.println("hello b"+c+d+z);
}
    b(){
}
}
public class parametrisedConstructor {
    public static void main(String[] args) {
        b b1=new b(100,20,300);
        a a1=new a(12,25);

    }
}

