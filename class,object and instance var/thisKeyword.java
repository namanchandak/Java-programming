public class thisKeyword {
    int a,b,c;
    void setdata(int a,int b,int c)
    {
this.a=a;
this.b=b;
this.c=c;
    }
    void show()
    {
        System.out.print(a+"    "+b+"   "+c);
    }
    public static void main(String[] args) {
        thisKeyword o=new thisKeyword();
        thisKeyword o1=new thisKeyword();
o1.setdata(123, 1234, 12345);
o.setdata(5, 7, 1234567);
o.show();
o1.show();
    }
}
