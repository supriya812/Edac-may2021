import java.util.*;
public class que4
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int x=a+b*c;
System.out.println("output x:"+x);
System.out.println("Enter numbers");
int p=sc.nextInt();
int q=sc.nextInt();
int r=sc.nextInt();
int y=(p+q)%r;
System.out.println("output y:"+y);
System.out.println("Enter numbers");
int l=sc.nextInt();
int m=sc.nextInt();
int n=sc.nextInt();
int o=sc.nextInt();
int z=l+(m*n)/o;
System.out.println("output z:"+z);
System.out.println("Enter numbers");
int u=sc.nextInt();
int v=sc.nextInt();
int w=sc.nextInt();
int s=sc.nextInt();
int t=sc.nextInt();
int k=sc.nextInt();
int j=u+(v/w)*s-t%k;
System.out.println("output r:"+j);
}
}