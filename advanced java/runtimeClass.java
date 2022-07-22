
public class runtimeClass {
    public static void main(String[] args) {
        System.out.println("hello volt");
    Runtime r=Runtime.getRuntime();
    try{
Process p=r.exec("notepad.exe");
p.waitFor();
    }
    catch(Exception e){
System.out.println(e);
    }
    System.out.println("good bye ");
    }
}
