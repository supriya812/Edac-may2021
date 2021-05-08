class pattern13
{
public static void main(String args[])
{
int alfa=64;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print((char)(alfa+i)+" ");
}
System.out.println();
}
}
}