import java.util.Scanner;
public class que23
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Binary number:");
int num=Integer.parseInt(sc.nextLine(),2);
String hexa=Integer.toHexString(num);
System.out.println("HexaDecimal value is:"+hexa);
}
}