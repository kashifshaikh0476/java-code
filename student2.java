class Student {
    int id;
    String sname;

 
    public void setStudentDetails(int id, String sname) {
        this.id = id;
        this.sname = sname;
    }

   
    public void displayStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + sname);
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + sname);
    }
}

class student2 {
    public static void main(String args[]) {
        Student s = new Student();

        
        s.setStudentDetails(1, "kashif");

        s.displayStudentDetails();
    }
}
