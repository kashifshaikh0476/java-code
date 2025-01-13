class bitwise
{
public static void main(String args[])
{
int  a=20;
int b=30;
int c;

c=a&b;

System.out.println("a&b="+c);

c=a | b;
System.out.println("a|b="+c);

c=a^b;
System.out.println("a^b="+c);

c=~a;
System.out.println("~a="+c);

c=a<<2;
System.out.println("a<<b="+c);

c=a>>5;
System.out.println("a>>5="+c);
}
}