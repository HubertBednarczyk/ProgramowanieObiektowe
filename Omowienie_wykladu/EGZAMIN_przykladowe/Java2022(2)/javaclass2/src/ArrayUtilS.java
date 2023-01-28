import java.util.Arrays;
import java.time.LocalDate;
import java.util.Comparator;

public class ArrayUtilS {

    public static <T> void selectionSort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 9};
        selectionSort(intArray, new IntegerComparator());
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        LocalDate[] dateArray = {LocalDate.of(2022, 12, 1), LocalDate.of(2021, 11, 30), LocalDate.of(2022, 1, 15)};
        selectionSort(dateArray, new LocalDateComparator());
        for (LocalDate date : dateArray) {
            System.out.print(date + " ");
        }
    }
}

class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

class LocalDateComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        return o1.compareTo(o2);
    }
}

