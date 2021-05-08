import java.util.Scanner;
public class que7
{
public static void main(String args[])
{
int x=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Input a number:");
x=sc.nextInt();
for(i=1;i<11;i++)
{
System.out.println(x+"*"+i+"="+x*i);
}
}
}