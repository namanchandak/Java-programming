public class toStringmrthod {
 String message;
 toStringmrthod(String s){
     message =s;
 }
public String toString(){
return message;
 }
 public static void main(String[] args) {
    toStringmrthod o=new toStringmrthod("hello    ");
    toStringmrthod o2=new toStringmrthod("volt");
System.out.println(o);
System.out.println(o2);
System.out.println(o.message);
 }
}
