import java.util.Scanner;
public class dynamicArray {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array     ");
int n=sc.nextInt();
int a[]=new int [n];
for (int i = 0; i < a.length; i++) {
    System.out.println("enter the value at position     "+(i+1));
    a[i]=sc.nextInt();
}
System.out.println("you have entered the  following \n");
for (int i : a) {
    System.out.println(i);
}
}
    }