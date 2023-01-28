package pl.kmi.ujd.Bednarczyk;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[nazwisko=" + nazwisko + ", dataUrodzenia=" + dataUrodzenia.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Osoba osoba = (Osoba) obj;
        return nazwisko.equals(osoba.nazwisko) && dataUrodzenia.equals(osoba.dataUrodzenia);
    }


    public int compareTo(Osoba osoba) {
        int compareNazwisko = nazwisko.compareTo(osoba.nazwisko);
        if (compareNazwisko != 0) return compareNazwisko;
        return dataUrodzenia.compareTo(osoba.dataUrodzenia);
    }
}

class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<>();
        grupa.add(new Student("Jan", "Kowalski", LocalDate.of(2000, 1, 1), 4.0));
        grupa.add(new Student("Anna", "Nowak", LocalDate.of(1999, 12, 31), 5.0));
        grupa.add(new Student("Jan", "Nowak", LocalDate.of(1998, 12, 31), 3.5));
        grupa.add(new Student("Anna", "Kowalski", LocalDate.of(2000, 1, 1), 4.5));
        grupa.add(new Student("Jan", "Kowalski", LocalDate.of(2000, 1, 2), 4.0));
        System.out.println("Original group: ");
        for (Student student : grupa) {
            System.out.println(student);
        }
        Collections.sort(grupa);
        System.out.println("Sorted group: ");
        for (Student student : grupa) {
            System.out.println(student);
        }
    }
}

class Student extends Osoba implements Cloneable, Comparable<Student> {
    private double sredniaOcen;
    public Student(String imie, String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(imie, nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }


    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Student o) {
        int result = super.compareTo(o);
        if (result == 0) {
            result = Double.compare(sredniaOcen, o.sredniaOcen);
        }
        return result;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}