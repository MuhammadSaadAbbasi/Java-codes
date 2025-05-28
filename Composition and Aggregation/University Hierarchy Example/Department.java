package saad;
import java.util.ArrayList;

public class Department {
    String deptName;
    ArrayList<Student> students = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addStudents(Student s1) {
        students.add(s1);
    }

    public String toString() {
        return "Department Name: " + deptName + "\tStudents: " + students;
    }
}
