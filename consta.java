// by constructor
class cons
{
int rollno;
String name;

public cons (int r,String n)
{
rollno=r;
name=n;
}
void show()
{
System.out.println("rollno"+rollno);
System.out.println("name"+name);
}
}
public class consta
{
public static void main(String args[])
{
cons c=new cons(04,"kashif");
cons c1=new cons(03,"nakul");
c.show();
c1.show();
}
}

