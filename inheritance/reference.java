class a{
void volt()
{
    System.out.println(" volt");
}
}
class b extends a{
void merlin()
{
    System.out.println(" volt by merlin");
}
}
public class reference {
    public static void main(String[] args) {
        a a1;
        b b1=new b();
    a1=b1;
b1.volt();
b1.merlin();
a1.volt();
    }
}
