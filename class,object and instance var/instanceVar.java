public class instanceVar {
    int a,b1,c;
    public static void main(String args[]) {
        Test o=new Test();
        Test o2=new Test();
o.a=12;

o2.a=100;
System.out.println(o.a+"    "+o2.a);
        System.out.println(o);
     System.out.println(o.hashCode());
     System.out.println(o.toString());
} 
}
