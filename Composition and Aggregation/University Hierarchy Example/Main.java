package saad;

public class Main {
    public static void main(String[] args) {
        University u1 = new University("MUET");

        u1.addDepartment(new Department("SW"));
        u1.addDepartment(new Department("CSE"));

        System.out.println("Department Names");
        u1.showDepartment();

        u1.addStudentstoUni("SW", new Student(31, "Saad"));
        u1.addStudentstoUni("SW", new Student(143, "CHuara"));
        u1.addStudentstoUni("CSE", new Student(100, "Saad"));
        u1.addStudentstoUni("CSE", new Student(120, "Saad"));

        System.out.println(u1);
    }
}
