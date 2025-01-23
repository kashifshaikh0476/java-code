// Java program to demonstrate constructor with parameters and object creation
public class pcons {
    String name;
    int id;
    pcons(int a , String s)
    {
        id = a;
        name = s;   
    }
    public static void main(String[] args)
    {
        pcons p = new pcons(101, "kashif");
        System.out.println("id : " + p.id + ", name : " + p.name);
    }
}
