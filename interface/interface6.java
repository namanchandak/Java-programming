interface a{
    void volt();

}
interface b extends a
{
    void merlin();
}
class c implements b{
    @Override
    public void volt() {
        // TODO Auto-generated method stub
        System.out.println("volt");
    }
    @Override
    public void merlin() {
        // TODO Auto-generated method stub
        
        System.out.println("merlin");
    }
}
public class interface6 {
    public static void main(String[] args) {
        c o=new c();
        o.merlin();
        o.volt();
       
    }
}
