import java.util.Scanner;
class Employe
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int eid;
String ename;
String eadd;
Float esal;
double esaving;
System.out.println("enter the employe id");
eid=obj.nextInt();
System.out.println("enter the employe name");
ename = obj.next();
System.out.println("enter the employe address");
eadd = obj.next();
System.out.println("enter the employe salary:");
esal = obj.nextFloat();
System.out.println("enter the employe saving:");
esaving = obj.nextDouble();
System.out.println("id of the employe is:"+eid);
System.out.println(" name of the employe is:"+ename);
System.out.println(" address of the employe is:"+eadd);
System.out.println(" salary of the employe is:"+esal);
System.out.println(" saving of the employe is:"+esaving);
}}


