public class throwKey {
   public static void main(String[] args) {
       int a=100,b=1 ;
try{
    if(b==1){
        throw new ArithmeticException("useless calculation");
}
    else{
        System.out.println(a/b);

    }
}
catch(ArithmeticException e)
{
    System.out.println(e);
}
System.out.println("bye bye");
   } 
}
