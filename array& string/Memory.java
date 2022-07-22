public class Memory {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("VOLT");
        String s3="hello";
        String s4="Hello";
        if(s1.equals(s2))
        {
            System.out.print("same");

        }
        else{
            System.out.print("not same ");
        }
        if(s1.equals(s3))
        {
            System.out.print("same");

        }
        else{
            System.out.print("not same");
        }
        if(s1.equalsIgnoreCase(s4))
        {
            System.out.print("same");

        }
        else{
            System.out.print("not same");
    }
    }
}

