import java.util.*;

public class vectorex2 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        
        vec.add("Apple ");
        vec.add("Banana ");
        vec.add("mango ");
        vec.add("cherry");
        System.out.println("size is: " + vec.size());
        System.out.println("default capacity is: " + vec.capacity());
        System.out.println("vector elements are: " + vec);
        
        vec.addElement("watermelon ");
        vec.addElement("pinapple");
        vec.addElement("coconut");

        System.out.println("size after addition: " + vec.size());
        System.out.println("capacity after addition: " + vec.capacity());
        System.out.println("vector elements are: " + vec);
        
        if (vec.contains("mango")) {
            System.out.println("mango is present at index " + vec.indexOf("mango"));
        } else {
            System.out.println("mango is not present in index");
        }
        
        System.out.println("the first element of index is: " + vec.firstElement());
        System.out.println("the last element of index is: " + vec.lastElement());
    }
}
