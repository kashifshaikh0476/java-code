//program of copy constructor:-
class copycons 
{
double price;
String name;

copycons(double p, String n)
{
    price=p;
    name=n;
}
copycons(copycons obj)
{
    System.out.println("copy constructor");
    price=obj.price;
    name=obj.name;
}
void show()
{
    System.out.println("Price: " + price + ", Name: " + name);
}
public static void main(String args[])
{
    copycons c1=new copycons(10,"pen");
    copycons c2=new copycons(5,"pencil");
    copycons c3=new copycons(3,"ruler");
    copycons c4=new copycons(5,"Eraser");
    copycons c5=new copycons(10,"sharpner");
    c1.show();
    c2.show();
    c3.show();
    c4.show();
    c5.show();
    
}
}