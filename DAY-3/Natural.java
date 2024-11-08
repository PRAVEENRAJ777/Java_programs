import java.util.Scanner;



class Natural
{
public static void main(String args[])
{
int i = 1;
int n;
Scanner obj = new Scanner(System.in);
System.out.println("enter the how many natural no's");
n = obj.nextInt();
while(i<=n)
{
System.out.print(i );
i++;
}
}
}