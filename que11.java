import java.util.Scanner;
public class que11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Input the radius:");
double radius=sc.nextDouble();
System.out.println("Perimeter is:"+(2 * Math.PI * radius));
System.out.println("Area is:"+(Math.PI * radius * radius));
}
}