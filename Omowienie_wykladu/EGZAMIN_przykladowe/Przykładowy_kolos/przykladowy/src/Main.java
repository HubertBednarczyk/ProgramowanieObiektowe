import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.time.LocalDate;


class ArrayUtil {
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        System.out.println(ArrayUtil.isSorted(intArray1)); // true

        Integer[] intArray2 = {5, 4, 3, 2, 1};
        System.out.println(ArrayUtil.isSorted(intArray2)); // false

        LocalDate[] dateArray1 = {LocalDate.of(2020, 1, 1), LocalDate.of(2020, 2, 1), LocalDate.of(2020, 3, 1)};
        System.out.println(ArrayUtil.isSorted(dateArray1)); // true

        LocalDate[] dateArray2 = {LocalDate.of(2020, 3, 1), LocalDate.of(2020, 2, 1), LocalDate.of(2020, 1, 1)};
        System.out.println(ArrayUtil.isSorted(dateArray2)); // false
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

}

class Util {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Util.print(intList); // 1, 2, 3, 4, 5,

        Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "c"));
        Util.print(stringSet); // a, c, b,

        Queue<LocalDate> dateQueue = new LinkedList<>(Arrays.asList(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 2, 1)));
        Util.print(dateQueue); // 2020-01-01, 2020-02-01,
    }

    public static <E> void print(Iterable<E> iterable) {
        for (E element : iterable) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
