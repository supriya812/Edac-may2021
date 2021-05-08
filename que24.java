import java.util.Scanner;
public class que24
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Binary number:");
int num=Integer.parseInt(sc.nextLine(),2);
String oct=Integer.toOctalString(num);
System.out.println("Octal value is:"+oct);
}
}