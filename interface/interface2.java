
 interface a {
abstract void volt1();
    }
    interface b {
        abstract void volt2();
        }
class c implements a,b
{
  public  void volt1()
    {
System.out.println("hello volt 1");
    }
    public  void volt2()
    {
System.out.println("hello volt 2");
    }
}
public class interface2 {
    public static void main(String[] args) {
        c o=new c();
        o.volt1();
        o.volt2();
    }
}
