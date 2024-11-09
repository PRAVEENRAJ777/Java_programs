import java.util.Scannr;
class Table
{
public static void main(String args[])
{
int i=1,n;
Scanner obj = new Scanner(System.in);
System.out.println("enter the table no:");
n = obj.nextInt();
for(i=1;i<=n;i++)
{
System.out.println("the 10 values for table is:"+ n+"*"+i"="+(n*i) );
}
}
}