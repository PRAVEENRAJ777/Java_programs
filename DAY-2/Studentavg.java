import java.util.Scanner;
class Studentavg
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int sno;
String sname;
Float sm1;
Float sm2;
Float sm3;
Float stotal;
Float savg;
System.out.println("the number of the student is:");
sno = obj.nextInt();
System.out.println("the name of the student is:");
sname = obj.next();
System.out.println("the m1 marks of the student is:");
sm1 = obj.nextFloat();
System.out.println("the m2 marks of the student is:");
sm2 = obj.nextFloat();
System.out.println("the m3 marks of the student is:");
sm3 = obj.nextFloat();
stotal = sm1+sm2+sm3;
savg = stotal/3;
System.out.println("the number of the student is:"+sno);
System.out.println("the name of the student is:" +sname);
System.out.println("the m1 marks of the student is:"+sm1);
System.out.println("the m2 marks of the student is:"+sm2);
System.out.println("the m3 marks of the student is:"+sm3);
System.out.println("the total marks of the student is:"+stotal);
System.out.println("the average marks of the student is:"+savg);

}}




