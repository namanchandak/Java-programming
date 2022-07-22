public class throw2 {
   void div(int a,int b){
       int c;
       if(b==1){
           throw new ArithmeticException("/ by 1");
       }
       else{
        c=a/b;
System.out.println(c);
       }
   
    } 
    public static void main(String[] args) {
        throw2 o=new throw2();
        try{
            o.div(10,2);
            o.div(10,5);
            o.div(10,0);
            o.div(10,1);
        }
catch(ArithmeticException e){
System.out.println(e);
}
    }
}
