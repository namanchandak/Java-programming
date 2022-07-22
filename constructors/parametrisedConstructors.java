public class parametrisedConstructors {
    int a,b,c;
    parametrisedConstructors(int x,int y,int z)
    {
a=x;b=y;c=z;
    }
void show()
{
    System.out.println(a+"  "+b+" "+c);
}
parametrisedConstructors()
{

}
public static void main(String[] args) {
    parametrisedConstructors o1=new parametrisedConstructors(12,23,34);
    parametrisedConstructors o2=new parametrisedConstructors(100,200,300);
    parametrisedConstructors o3=new parametrisedConstructors();
    o1.show();
    o2.show();
    o3.show();
    System.out.print(o3.a+" "+o3.b);
}
}
