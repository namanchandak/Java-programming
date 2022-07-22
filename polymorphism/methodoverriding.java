class a{
void volt()
{
    System.out.println("hello a");
}
}
class b extends a{
    void volt()
    {
        System.out.println("hello b");
    }
}
class methodoverriding{
    public static void main(String[] args) {
        a a1=new a();
        b b1=new b();
        a1.volt();
        b1.volt();
    }
}