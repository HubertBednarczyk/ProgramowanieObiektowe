package pl.kmi.ujd.Bednarczyk;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println("Zadanie 1");
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Jan");
        pracownicy.add("Anna");
        pracownicy.add("Piotr");
        pracownicy.add("Katarzyna");
        pracownicy.add("Karol");
        pracownicy.add("Agnieszka");

        System.out.println("Przed redukcją: " + pracownicy);
        redukuj(pracownicy, 3);
        System.out.println("Po redukcji: " + pracownicy);

        //Zadanie 2
        System.out.println("Zadanie 2");
        LinkedList<String> pracownicy2 = new LinkedList<>();
        pracownicy2.add("Jan");
        pracownicy2.add("Anna");
        pracownicy2.add("Piotr");
        pracownicy2.add("Katarzyna");
        pracownicy2.add("Karol");
        pracownicy2.add("Agnieszka");

        System.out.println("Przed redukcją: " + pracownicy2);
        redukuj(pracownicy2, 3);
        System.out.println("Po redukcji: " + pracownicy2);

        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        liczby.add(6);

        System.out.println("Przed redukcją: " + liczby);
        redukuj2(liczby, 2);
        System.out.println("Po redukcji: " + liczby);
    }
    //zadanie1
    public static void redukuj(LinkedList<String> pracownicy, int n) {
        int index = n - 1;
        while (index < pracownicy.size()) {
            pracownicy.remove(index);
            index += n - 1;
        }
    }
    //zadanie2
    public static <T> void redukuj2(LinkedList<T> lista, int n) {
        int index = n - 1;
        while (index < lista.size()) {
            lista.remove(index);
            index += n - 1;
        }
    }
}