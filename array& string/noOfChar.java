public class noOfChar {
 public static void main(String[] args) {
     int a=0,b=0;
     String s1="the future is fantastic";
     for (int i = 0; i < s1.length(); i++) {
         if(s1.charAt(i)==' ')
         {
a++;
         }
         else{
             b++;
         }
     }
     System.out.print("spaces="+a+" char="+b);
 }   
}
