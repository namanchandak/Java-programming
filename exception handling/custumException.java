class myexcep extends Exception{
String s1;
myexcep(String str)
{
    s1=str;
}
String toString(String str){
    return ("myException"+str+" "+s1);
}
}
public class custumException {
    public static void main(String[] args) {
        int a=10,b=1;
        try{
            if (b==1){
                throw new myexcep("divide by 1");
            }
            else{
                System.out.println(a/b);
            }
        }
        catch(myexcep e)
        {
System.out.println("from catch /1");
System.out.println(e);
        }

        
    }
}
