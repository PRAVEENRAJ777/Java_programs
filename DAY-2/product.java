import java.util.Scanner;
class Product
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int pid;
String pname;
String padd;
Float pcost;
Float pquantity;
Float ptotalbill;
System.out.println("enter the product id");
pid=obj.nextInt();
System.out.println("enter the product name");
pname = obj.next();
System.out.println("enter the product address");
padd = obj.next();
System.out.println("enter the product cost:");
pcost = obj.nextFloat();
System.out.println("enter the product quantity:");
pquantity = obj.nextFloat();
ptotalbill = pcost * pquantity;
System.out.println("id of the product is:"+pid);
System.out.println(" name of the product is:"+pname);
System.out.println(" address of the product is:"+padd);
System.out.println(" cost of the product is:"+pcost);
System.out.println(" quantity of the product is:"+pquantity);
System.out.println(" total bill  of the product is:"+ptotalbill);

}}


