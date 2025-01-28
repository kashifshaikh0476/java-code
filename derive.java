class A
{
    public void a()
    {
        System.out.println("A");
    }
}
class B extends A
{
    public void b()
    {
        System.out.println("B");
    }
}
class C extends A
{
    public void c()
    {
        System.out.println("C");
    }
}
class D extends A
{
public void d()
{
    System.out.println("D");
}
}
class derive
{
    public static void main(String args[])
    {
        B b=new B();
        b.a();
        b.b();
        C c=new C();
        c.a();
        c.c();
        D d=new D();
        d.a();
        d.d();
        

    }
}
 