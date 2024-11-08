import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
Float cradi;
Float pi = 3.14F;
Float area;
System.out.println("enter the radius of the circle");
cradi = obj.nextFloat();
area = pi *cradi *cradi;
System.out.println("Area of the circle is:"+area);
}
}