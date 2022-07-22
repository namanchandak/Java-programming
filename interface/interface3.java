interface a{
    void volt();
    void add();
}
 interface b {
void merlin();
void add();
}
class c implements a,b{
   public void volt(){
System.out.println("volt ");
    }

public void add(){
    System.out.println("add ");
        }
        public void merlin(){
            System.out.println("merlin ");
                }
            }
public class interface3 {
    public static void main(String[] args) {
        c o=new c();
        o.add();
        o.merlin();
    o.volt();
    }
}
