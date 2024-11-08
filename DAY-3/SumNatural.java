import java.util.Scanner;



class SumNatural
{
public static void main(String args[])
{
int i = 1;
int n,sum = 0;
Scanner obj = new Scanner(System.in);
System.out.println("enter the number of no's for sum");
n = obj.nextInt();
while(i<=n)
{
sum = sum+i;
i++;
}
System.out.println("the sum is:"+sum);
}
}