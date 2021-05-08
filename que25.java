import java.util.Scanner;
public class que25
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Octal number:");
String oct=sc.nextLine();
int num=Integer.parseInt(oct,8);
System.out.println("Decimal value is:"+num);
}
}