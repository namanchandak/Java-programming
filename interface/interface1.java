interface a{
void volt();
}
class b implements a
{
@Override
public void volt() {
    // TODO Auto-generated method stub
    System.out.println("hello volt");
}
}
public class interface1 {
    public static void main(String[] args) {
        b o1=new b();
        o1.volt();
    }
}
