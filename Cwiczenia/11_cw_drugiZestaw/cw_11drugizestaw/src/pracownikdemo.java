import java.time.LocalDate;

class EmployeeDemo1 {
    public static void main(String[] args) {
        Employee[] personel = new Employee[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Employee("Harry Cracker", 75000, 2001, 12, 15);
        personel[1] = new Employee("Caroline Hacker", 50000, 2003, 10, 1);
        personel[2] = new Employee("Antony Tester", 40000, 2005, 3, 15);

        // zwieksz pobory każdego pracownika o 20%
        for (Employee e : personel) {
            e.raiseSalary(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Employee e : personel) {
            System.out.print("nazwisko = " + e.getName() + "\tid = " + e.getId());
            System.out.print("\tpobory = " + e.getSalary());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.getHireDay());
        }
        System.out.println();

        // Dodane w stosunku do poprzedniej wersji
        int n = Employee.getNextId(); // wywołanie metody statycznej
        System.out.println("Nastepny dostepny id = " + n);
    }
}

class Employee {
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;

        LocalDate hireDate = LocalDate.of(year, month, day);
        hireDay = hireDate;

        // Dodane w stosunku do poprzedniej wersji
        id = nextId;
        ++nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double percent) {
        double raise = salary * percent / 100;
        salary += raise;
    }

    // Dodane w stosunku do poprzedniej wersji
    public int getId() {
        return id;
    }

    // Dodane w stosunku do poprzedniej wersji
    public void setId() {
        id = nextId;
        ++nextId;
    }

    // Dodane w stosunku do poprzedniej wersji
    public static int getNextId() {
        return nextId;
    }

    private String name;
    private double salary;
    private LocalDate hireDay;

    // Dodane w stosunku do poprzedniej wersji
    private int id;
    private static int nextId = 1;
}