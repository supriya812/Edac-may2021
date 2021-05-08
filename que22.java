import java.util.Scanner;
public class que22
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long binarynum,decnum=0,x=1;
long reminder;
System.out.print("Input a binary number:");
binarynum=sc.nextLong();
while(binarynum!=0)
{
reminder=binarynum%10;
decnum=decnum+reminder*x;
x=x*2;
binarynum=binarynum/10;
}
System.out.print("Deciaml number="+decnum);
}
}