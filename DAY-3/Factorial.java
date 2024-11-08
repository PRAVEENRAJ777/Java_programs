import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int i = 1;
int n,f = 1;
Scanner obj = new Scanner(System.in);
System.out.println("enter the factorial number ");
n = obj.nextInt();
while(i<=n)
{
f = f*i;
i++;
}
System.out.println("the ans of factorial no is:"+f);
}}