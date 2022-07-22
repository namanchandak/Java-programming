public class multipleTryCatch {
   public static void main(String[] args) {
       int a=10,b=0,c=1,d;
   try{
       d=a/b;
       System.out.println(d);
   }
   catch(ArithmeticException e)
   {
       System.out.println(e);
       System.out.println("infinity");

   }
   try{
       d=a/c;
       System.out.println(d);
   }
   catch(ArithmeticException e)
   {
    System.out.println("dont divide with 0");
   }
    } 
}
