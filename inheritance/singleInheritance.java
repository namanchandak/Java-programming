class a{
    int b=20;
void show()
{ int a2=10;
    System.out.println("hello a");
}
}
class b extends a{
    int c=30;
void display(){ 
    int d=40;
    System.out.println("hello b");
}
}
public class singleInheritance {
    public static void main(String[] args) {
        
        a a1=new a();
        b b1=new b();
        
        a1.show();
        b1.display();
        b1.show();
        System.out.print(a.class+"    "+a.class+"   "+b.class);
    }
}
