interface a{
    int i=10;
    void volt();
  
}
 interface b {
     int j=20;
void merlin();

}
class c implements a,b{
   public void volt(){
System.out.println("volt ");
    }
    public void merlin(){
        System.out.println("merlin ");
            }
            void abcd()
            {
                System.out.println(a.i);
                System.out.println(b.j);
            }
}
public class interface4 {
    public static void main(String[] args) {
        c o=new c();
        o.abcd();
        o.merlin();
    o.volt();
    }
}

