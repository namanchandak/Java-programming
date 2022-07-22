class a{
final void volt()
{
System.out.println("hello a");
}
}
class b extends a{
//void volt()-->not allowed 

}
public class final3 {
   public static void main(String[] args) {
       a a1=new a();
       b b1=new b();
       a1.volt();
       b1.volt();
   } 
}
