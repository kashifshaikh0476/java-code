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
public static void main(string args[])
{
cons c=new cons(04,"kashif");
c.show();
}
}

