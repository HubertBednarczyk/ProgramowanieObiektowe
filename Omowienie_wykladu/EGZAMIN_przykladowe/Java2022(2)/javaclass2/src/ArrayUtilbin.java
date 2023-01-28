import java.util.Arrays;
import java.time.LocalDate;

public class ArrayUtilbin {
    public static <T extends Comparable<T>> int binSearch(T[] array, T element) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid].compareTo(element) == 0) {
                return mid;
            } else if (array[mid].compareTo(element) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}



class ArrayUtilDemobin {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        int index = ArrayUtilbin.binSearch(intArray, 3);
        System.out.println("Index of 3 in intArray: " + index);

        LocalDate[] dateArray = {
                LocalDate.of(2020, 1, 1),
                LocalDate.of(2020, 2, 1),
                LocalDate.of(2020, 3, 1),
                LocalDate.of(2020, 4, 1)
        };
        LocalDate dateToFind = LocalDate.of(2020, 3, 1);
        index = ArrayUtilbin.binSearch(dateArray, dateToFind);
        System.out.println("Index of " + dateToFind + " in dateArray: " + index);
    }
}
