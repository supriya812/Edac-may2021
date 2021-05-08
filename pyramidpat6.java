public class pyramidpat6
{
public static void main(String args[])
{
for(int i=1;i<=9;i++)
{
for(int j=0;j<=1;j--)
{
System.out.print(" ");
}
for(int k=i;k<=i;k++)
{
System.out.print(" * ");
}
for(int l=1;l<=i;l++)
{
System.out.print("*");
}
System.out.println();
}
}
}