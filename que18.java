public class que18
{
public static void main(String args[])
{
String binarynum1="10",binarynum2="11";
Integer int1=Integer.parseInt(binarynum1,2);
Integer int2=Integer.parseInt(binarynum2,2);
Integer output=int1*int2;
System.out.println(Integer.toBinaryString(output));
}
}