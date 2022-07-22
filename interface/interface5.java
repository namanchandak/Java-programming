interface a{
    void show();
}
interface b
{
    void display();
}
class c {
    void volt(){
        System.out.println("hello votl");
    }
}
class d extends c implements a,b{
public void show(){
    System.out.println("hello show");
}
public void display(){
    System.out.println("hello display");
}
}

public class interface5 {
    public static void main(String[] args) {
        d o=new d();
        o.display();
        o.volt();
        o.show();
        
    }
}
