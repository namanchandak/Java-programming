public class staticCombination {
    static int a=10;
    static 
    {
        System.out.print(" obj ");
a=a*5;
System.out.print(" obj "+a);
    }
    static void show()
    {
a=a+5;
System.out.print(" "+a+" ");
    }
    public static void main(String[] args) {
        System.out.print("obj "+a+" "+staticCombination.a+" ");
        staticCombination.show();
        
        System.out.print(staticCombination.a);
        
    }
}
