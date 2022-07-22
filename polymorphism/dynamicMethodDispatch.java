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
    class c extends a{
        void volt()
        {
            System.out.println("hello c");
        }
    }

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        a a1;
        b b1=new b();
        a1=b1;
        a1.volt();
c c1=new c();
a1=c1;
a1.volt();
    }
}
