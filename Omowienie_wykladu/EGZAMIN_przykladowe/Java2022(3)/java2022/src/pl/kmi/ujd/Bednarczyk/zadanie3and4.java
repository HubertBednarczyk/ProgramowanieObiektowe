package pl.kmi.ujd.Bednarczyk;

import java.util.LinkedList;
import java.util.Collections;

public class zadanie3and4 {
    //Zadanie3
    public static void odwroc(LinkedList<String> lista) {
        Collections.reverse(lista);
    }
    //Zadanie4
    public static <T> void odwroc2(LinkedList<T> lista) {
        Collections.reverse(lista);
    }
    public static void main(String[] args) {
        //Zadanie 3
        System.out.println("Zadanie 3");
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Jan");
        lista.add("Anna");
        lista.add("Piotr");
        lista.add("Katarzyna");
        lista.add("Karol");
        lista.add("Agnieszka");

        System.out.println("Przed odwróceniem: " + lista);
        odwroc(lista);
        System.out.println("Po odwróceniu: " + lista);
        //Zadanie 4
        System.out.println("Zadanie 4");
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        lista1.add(6);

        System.out.println("Przed odwróceniem: " + lista1);
        odwroc2(lista1);
        System.out.println("Po odwróceniu: " + lista1);

        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("Jan");
        lista2.add("Anna");
        lista2.add("Piotr");
        lista2.add("Katarzyna");
        lista2.add("Karol");
        lista2.add("Agnieszka");

        System.out.println("Przed odwróceniem: " + lista2);
        odwroc2(lista2);
        System.out.println("Po odwróceniu: " + lista2);
    }
}
