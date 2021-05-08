class pat6
{
public static void main(String args[])
{
for(int i=1;i<=8;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=9-i;k++)
{
System.out.print("*");
}
for(int l=1;l<=i-1;l++)
{
System.out.print("*");
}
System.out.println();
}
}
}