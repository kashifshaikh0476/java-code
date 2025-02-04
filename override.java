class animal
{
    void move()
    {
        System.out.println("Animal is moving...");
    }
    void eat()
    {
        System.out.println("Animal is eating...");
    }
}
class dog extends animal{
    void move()
    {
        System.out.println("Dog is running...");
    }
    void bark()
    {
        System.out.println("Dog is barking...");
    }
}
public class override
{
    public static void main(String args[])
    {
        dog d=new dog();
        d.move();
        d.eat();
        d.bark();
    }
}