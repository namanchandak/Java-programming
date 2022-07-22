abstract class a{
   abstract void volt();
   void display()
   {
    System.out.println("hello display");
   }
}
class b extends a{
    void volt()
    {
System.out.println("hello votl");
    }
}
public class abstractkey {
    public static void main(String[] args) {
        a o1;
        b o2=new b();
        o2.volt();
        o2.display();
       
    }
}
