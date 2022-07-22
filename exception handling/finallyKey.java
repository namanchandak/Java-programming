public class finallyKey {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("infinity");
            System.out.println(e);
        }
        finally{
            System.out.println("hello volt");
            c=a/b;
            System.out.println(c);
        }
    }
}
