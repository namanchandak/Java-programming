public class copyConstructor {
    int a,b,c;
    copyConstructor(int x,int y,int z)
    {
a=x;b=y;c=z;
    } 
    copyConstructor()
            {

    }
    void show()
{
    System.out.println(a+"  "+b+" "+c);
}
copyConstructor(copyConstructor t)
{
    a=t.a;b=t.b;c=t.c;
}


public static void main(String[] args) {
    copyConstructor o1=new copyConstructor(10,20,30);
    copyConstructor o2=new copyConstructor(o1);
    copyConstructor o3=new copyConstructor(o2);
    o1.show();
    o2.show();
    o3.show();
    System.out.print(o1.a);
}

}