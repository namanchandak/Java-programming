public class final2 {
  final int a;
  final2(int x)
  {
    a=x;
  }  
  void volt()
  {
      System.out.println(a);
  }
  public static void main(String[] args) {
      final2 o1=new final2(10);
      final2 o2=new final2(10000);
      o1.volt();
      o2.volt();
  }
}
