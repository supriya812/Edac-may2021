class pattern10
{
public static void main(String args[])
{
int a=64;
for(int i=5;i>=1;i--)
{
for(int j=i;j<=5;j++)
{
System.out.print((char)(a+j)+" ");
}
System.out.println();
}
}
}