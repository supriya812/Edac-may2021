import java.util.Scanner;
public class que13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Width and height:");
double w=sc.nextDouble();
double h=sc.nextDouble();
double p=2*(w+h);
double a=w*h;
System.out.println("perimeter of rectangle:"+p);
System.out.println("Area of rectangle:"+a);
}
}
