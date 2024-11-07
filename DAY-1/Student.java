             
import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int sno;
String sname;
Float maths,physics,chemistry;
Float total;
Float saverage;
System.out.println("Enter the student number:");
sno = obj.nextInt();
System.out.println("Enter the student name:");
sname = obj.next();
System.out.println("Enter the maths marks:");
maths = obj.nextFloat();
System.out.println("Enter the physics marks:");
physics = obj.nextFloat();
System.out.println("Enter the chemistry marks:");
chemistry = obj.nextFloat();
 total = maths+physics+chemistry;
 saverage = total/3;
System.out.println(" the number of the student is:"+sno);
System.out.println(" the name of the student is:"+sname);
System.out.println(" the maths marks of the student is:"+maths);
System.out.println(" the physics marks of the student is:"+physics);
System.out.println(" the chemistry marks of the student is:"+chemistry);
System.out.println(" the total marks of the student is:"+total);
System.out.println(" the average marks of the student is:"+saverage);
}
}








