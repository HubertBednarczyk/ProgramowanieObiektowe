import java.util.TreeMap;

public class StudentGrades {
    private TreeMap<String, String> students = new TreeMap<>();

    public void addStudent(String name, String grade) {
        students.put(name, grade);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void updateGrade(String name, String newGrade) {
        students.put(name, newGrade);
    }

    public void printStudents() {
        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        sg.addStudent("Carl", "db+");
        sg.addStudent("Joe", "db");
        sg.addStudent("Susan", "bdb");
        sg.printStudents();
        sg.removeStudent("Joe");
        sg.printStudents();
        sg.updateGrade("Carl", "a");
        sg.printStudents();
    }
}
