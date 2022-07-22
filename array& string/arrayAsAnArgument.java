public class arrayAsAnArgument {
  void add(int a[])
  {
      int i,sum=0;
      for(i=0;i<a.length;i++)
      {
sum=sum+a[i];

      }
      System.out.print(sum);
  }
  public static void main(String[] args) {
    arrayAsAnArgument o1=new arrayAsAnArgument(); 
    int a[]={1,2,3,4,5,6};
    o1.add(a);
 }
    }
