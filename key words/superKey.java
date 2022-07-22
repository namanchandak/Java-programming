class a{
int a=100;
}
class b extends a
{int a=200;
    void volt(){
        int a=300;
        System.out.println(a);
        System.out.println(this.a);
        System.out.print(super.a);
    }

}

public class superKey {
  public static void main(String[] args) {
      b b1=new b();
      b1.volt();
  }  
}
