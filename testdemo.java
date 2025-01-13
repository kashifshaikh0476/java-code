//by method
class demo
{
int rollno;
String name;
void get(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
void put()
{
System.out.println("rollno="+rollno);
System.out.println("name="+name);
}
}
public class testdemo
{
public static void main(String args[])
{
demo d = new demo();
d.get(03,"kashif");
d.put();
}
}