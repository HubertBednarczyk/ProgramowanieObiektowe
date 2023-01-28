package pl.kmi.ujd.Bednarczyk;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", "Kowalski", LocalDate.of(1980, 1, 1));
        Osoba osoba2 = new Osoba("Anna", "Nowak", LocalDate.of(1990, 2, 2));

        System.out.println(osoba1); // wyświetli "pl.kmi.ujd.nazwisko.Osoba[nazwisko=Kowalski, dataUrodzenia=1990-01-01]"
        System.out.println(osoba1.equals(osoba2)); // wyświetli "true"
        System.out.println(osoba1.equals(osoba1)); // wyświetli "false"
        System.out.println(osoba1.compareTo(osoba2)); // wyświetli "-1"
    }
}
