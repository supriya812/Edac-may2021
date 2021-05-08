import java.util.Scanner;
public class lab6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Input first number:");
int a=sc.nextInt();
System.out.println("Input second number:");
int b=sc.nextInt();
int add=a+b;
int sub=a-b;
int multi=a*b;
int division =a/b;
int mod=a%b;
System.out.println(a+b);
System.out.println(a-b);
System.out.println("output:"+a*b);
System.out.println("output:"+a/b);
System.out.println("output:"+a%b);
}
}
