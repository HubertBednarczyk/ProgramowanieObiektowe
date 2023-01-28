import java.util.TreeMap;

class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int id;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student other) {
        int surnameCmp = this.surname.compareTo(other.surname);
        if (surnameCmp != 0) {
            return surnameCmp;
        }

        int nameCmp = this.name.compareTo(other.name);
        if (nameCmp != 0) {
            return nameCmp;
        }

        return Integer.compare(this.id, other.id);
    }
}

public class StudentGradess {
    private TreeMap<Student, String> students = new TreeMap<>();
    private TreeMap<Integer, Student> idToStudent = new TreeMap<>();

    public void addStudent(String name, String surname, int id, String grade) {
        Student student = new Student(name, surname, id);
        students.put(student, grade);
        idToStudent.put(id, student);
    }

    public void removeStudent(int id) {
        Student student = idToStudent.get(id);
        students.remove(student);
        idToStudent.remove(id);
    }

    public void updateGrade(int id, String newGrade) {
        Student student = idToStudent.get(id);
        students.put(student, newGrade);
    }

    public void printStudents() {
        for (var entry : students.entrySet()) {
            Student student = entry.getKey();
            System.out.println(student.getSurname() + " " + student.getName() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentGradess sg = new StudentGradess();
        sg.addStudent("Carl", "Johnson", 1, "db+");
        sg.addStudent("Joe", "Smith", 2, "db");
        sg.addStudent("Susan", "Smith", 3, "bdb");
        sg.printStudents();
        sg.removeStudent(2);
        sg.printStudents();
        sg.updateGrade(1, "a");
        sg.printStudents();
    }
}
