//parameterized constructor program:-
class pcons {
    int id;
    String name;
    float percent;

    pcons(int id, String name, float percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    public static void main(String args[]) {
        pcons p1 = new pcons(101, "kashif", 97.5f);
        pcons p2 = new pcons(102, "zakwan", 98.5f);
        pcons p3 = new pcons(103, "faiz", 94.5f);
        pcons p4 = new pcons(104, "ammar", 93.5f);
        
       
        System.out.println("ID: " + p1.id + ", Name: " + p1.name + ", Percent: " + p1.percent);
        System.out.println("ID: " + p2.id + ", Name: " + p2.name + ", Percent: " + p2.percent);
        System.out.println("ID: " + p3.id + ", Name: " + p3.name + ", Percent: " + p3.percent);
        System.out.println("ID: " + p4.id + ", Name: " + p4.name + ", Percent: " + p4.percent);
    }
}
