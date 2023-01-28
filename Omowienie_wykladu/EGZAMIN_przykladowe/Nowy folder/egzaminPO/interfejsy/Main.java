import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        ArrayList<Osoba>grupa=new ArrayList<>();
        grupa.add(new Osoba("Jasik", LocalDate.now()));
        grupa.add(new Osoba("Jasik",LocalDate.of(2001,11,3)));
        grupa.add(new Osoba("Słowacki",LocalDate.of(2005,5,5)));
        grupa.add(new Osoba("Adamowicz",LocalDate.of(2005,5,5)));
        grupa.add(new Osoba("Kownacki",LocalDate.of(2002,7,11)));
        Osoba jeden=new Osoba("Furman",LocalDate.now());
        Osoba dwa= (Osoba) jeden.clone();
        grupa.add(jeden);

        for(Osoba i: grupa){
            System.out.println(i);
        }

        Collections.sort(grupa);

        System.out.println("----------");
        for(Osoba i: grupa){
            System.out.println(i);
        }

        ArrayList<Student>dziennik=new ArrayList<>();
        Student s1=new Student("Edamski",LocalDate.of(1999,7,11),3.93);
        Student s2=new Student("Edamski",LocalDate.of(1999,7,11),3.93);
        Student s3=new Student("Maksiu",LocalDate.of(1989,11,3),2.01);
        dziennik.add(s1);
        dziennik.add(s2);
        dziennik.add(s3);

        for(Student i: dziennik){
            System.out.println(i);
        }

        Collections.sort(dziennik);
        System.out.println("----------");
        for(Student i: dziennik){
            System.out.println(i);
        }


    }
}