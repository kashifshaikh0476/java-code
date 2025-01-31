//to find the square root and power of number
import java.util.Scanner;
class squareroot
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("enter a number for square root: ");
        int num=scanner.nextInt();
        System.out.println("square root is: "+Math.sqrt(num));
        
        System.out.println("enter the base or exponent of the number for fond spower of number: ");
        int base=scanner.nextInt();
        int exponent=scanner.nextInt();
        System.out.println("power of the number is: "+Math.pow(base,exponent));
        
        scanner.close();
    }
}