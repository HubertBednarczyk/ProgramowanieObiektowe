package pl.kmi.ujd.Bednarczyk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Osobapomoc {
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;

    public Osobapomoc(String imie, String nazwisko, String dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }
}

public class TestOsoba {
    public static void main(String[] args) {
        List<Osobapomoc> grupa = new ArrayList<>();
        grupa.add(new Osobapomoc("John", "Doe", "01-01-2000"));
        grupa.add(new Osobapomoc("Jane", "Doe", "02-02-2000"));
        grupa.add(new Osobapomoc("Bob", "Smith", "03-03-2000"));
        grupa.add(new Osobapomoc("Sara", "Johnson", "03-03-2000"));
        grupa.add(new Osobapomoc("Your", "Name", "04-04-2000"));

        System.out.println("Zawartość listy przed sortowaniem:");
        for (Osobapomoc osoba : grupa) {
            System.out.println(osoba.getImie() + " " + osoba.getNazwisko() + " " + osoba.getDataUrodzenia());
        }

        Collections.sort(grupa, (o1, o2) -> o1.getNazwisko().compareTo(o2.getNazwisko()));

        System.out.println("Zawartość listy po sortowaniu:");
        for (Osobapomoc osoba : grupa) {
            System.out.println(osoba.getImie() + " " + osoba.getNazwisko() + " " + osoba.getDataUrodzenia());
        }
    }
}

