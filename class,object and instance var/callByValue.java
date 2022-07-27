public class callByValue {
    int a,b,c;
    void show()
    {
        System.out.println(a+"  "+b+"   "+c);
    }
    void setdata(int x,int y,int z)
    {
        a=x;b=y;c=z;
    }
    public static void main(String[] args) {
        callByValue o1=new callByValue();
        callByValue o2=new callByValue();
        o1.setdata(10,20,30);
        o2.setdata(100,200,300);
        o1.show();
        o2.show();
    }}
