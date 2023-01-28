package pl.kmi.ujd.Bednarczyk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class zadanie5 {
    public static void main(String[] args) {
        //Zadanie A
        System.out.println("Zadanie a)");
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("programming");

        convertToUpperCaseWithIterator(list);

        System.out.println(list);
        //Zadanie B
        System.out.println("Zadanie b)");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("world");
        list2.add("java");
        list2.add("programming");

        convertToUpperCaseWithEnhancedForLoop(list2);

        System.out.println(list2);
        //Zadanie C
        System.out.println("Zadanie c)");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("world");
        list3.add("java");
        list3.add("programming");

        convertToUpperCaseWithReplaceAll(list3);

        System.out.println(list3);
    }

    public static void convertToUpperCaseWithIterator(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(list);
        for (String s : copy) {
            int index = list.indexOf(s);
            list.set(index, s.toUpperCase());
        }
    }

    public static void convertToUpperCaseWithEnhancedForLoop(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
    }
    public static void convertToUpperCaseWithReplaceAll(ArrayList<String> list) {
        list.replaceAll(String::toUpperCase);
    }
}
