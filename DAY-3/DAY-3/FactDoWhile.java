import java.util.Scanner;
class FactDoWhile
{
public static void main (String args[])
{
int i = 1,n;
int f=1;
Scanner obj = new Scanner(System.in);
System.out.println("enter the factorial no:");
n = obj.nextInt();
do
{
System.out.println("the ans of factorial is:"+f*i);
f = f * i;
i++;
}
while(i<=n);
}
}