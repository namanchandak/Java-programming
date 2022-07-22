class a{
    a()
    {
        System.out.println("hello a");
    }
}
class b extends a{
   
b()
{
    System.out.println("hello b");
}
}
public class constructors {
    public static void main(String[] args) {
        b b1=new b();
        a a1=new a();
    }
}
