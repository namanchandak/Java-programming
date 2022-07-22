class compilePolymorphism{
void volt()
{
    System.out.println("VOLT");
}
void volt(int a,int b)
{
    System.out.println("VOLT    "+a+b);
}
void volt(int a,int b,int c)
{
    System.out.println("VOLT    "+a+b+c);
}
void volt(int a,int b,Double c)
{
    System.out.println("VOLT double   "+a+b+c);
}
public static void main(String[] args) {
    compilePolymorphism o=new compilePolymorphism();
    o.volt();
    o.volt(110,200);
    o.volt(100,200,300);
    o.volt(123,456,789.0);
}
}

