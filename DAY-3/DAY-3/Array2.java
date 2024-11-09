import java.util.Scanner;
class Array2
{
public static void main(String args[])
{
int i=0,n,sum=0;
Scanner obj = new Scanner(System.in);
System.out.println("Enter array size:");
n = obj.nextInt();
int a[] = new int[n];
System.out.println("enter elements to array:");
for(i=0;i<a.length;i++)
{
a[i] = obj.nextInt();
}
System.out.println("the elements in array is:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
for(i=0;i<a.length;i++)
{
sum = sum+a[i];
}
System.out.println("sum of an array is:"+sum);
}
}
