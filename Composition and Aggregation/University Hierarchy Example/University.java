package saad;
import java.util.ArrayList;

public class University {
    String uniName;
    ArrayList<Department> departments = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showDepartment() {
        for (Department d : departments) {
            System.out.println("Department = " + d.deptName);
        }
    }

    Department getDepartment(String name) {
        for (Department d : departments) {
            if (name.equals(d.deptName)) {
                return d;
            }
        }
        System.out.println("Department not Exist");
        return null;
    }

    void addStudentstoUni(String name, Student s1) {
        Department d = getDepartment(name);
        if (d != null) {
            d.addStudents(s1);
        }
    }

    public String toString() {
        return "University Name: " + uniName + "\n" + departments;
    }
}
