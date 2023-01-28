package pl.kmi.ujd.Bednarczyk;

import java.util.Arrays;
import java.util.HashSet;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
//import java.util.Map;
import java.util.Set;


public class Zadanie6 {
    public static <E> void print(Iterable<E> iterable) {
        Iterator<E> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            System.out.print(element);
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Set<String> set = new HashSet<>(Arrays.asList("a", "b", "c"));
        print(list);
        print(set);
    }

}
