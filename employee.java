import java.util.Scanner;

class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
for(int i=0;i<5;i++)
{
       System.out.println("Enter employee name: ");
        String str1 = sc.nextLine();

        System.out.println("Enter employee ID: ");
        String str2 = sc.nextLine();

        System.out.println("Enter employee salary: ");
        int i3 = sc.nextInt();

        System.out.println("Enter employee contact no: ");
        long i4 = sc.nextLong();
}
for(int i=0;<5;i++)
{
        System.out.println("Employee name: " + str1);
        System.out.println("Employee ID: " + str2);
        System.out.println("Employee salary: " + i3);
        System.out.println("Employee contact no: " + i4);

        sc.close();
    }
}
}
