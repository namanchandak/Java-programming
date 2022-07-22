public class tryAndCatch {
  public static void main(String[] args) {
      int a=0,b=10,c;

      try
      {
c=b/a;
System.out.println(c);
      }
      catch(ArithmeticException e){
        System.out.println("infinity dont divide by 0");
        System.out.println(e);
      }
      System.out.println("bye");
  }  
}
