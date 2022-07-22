class varArgs{
void add(int ...a)
{
int sum=0,i;
for (i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
public static void main(String[] args) {
    varArgs o1=new varArgs();
    o1.add(1,2,3,4,5);
    o1.add(1,2,3,4,5,6,7,89,10);
}
}