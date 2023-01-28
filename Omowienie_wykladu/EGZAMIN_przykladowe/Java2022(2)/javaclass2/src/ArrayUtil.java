import java.time.LocalDate;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}

class ArrayUtilDemo {
    public static void main(String[] args) {
        Integer[] sortedIntArray = {1, 2, 3, 4, 5};
        Integer[] unsortedIntArray = {5, 3, 2, 1};
        LocalDate[] sortedDateArray = {LocalDate.of(2022, 1, 1), LocalDate.of(2022, 2, 1), LocalDate.of(2022, 3, 1)};
        LocalDate[] unsortedDateArray = {LocalDate.of(2022, 3, 1), LocalDate.of(2022, 1, 1), LocalDate.of(2022, 2, 1)};

        System.out.println("Is sortedIntArray sorted? " + ArrayUtil.isSorted(sortedIntArray));
        System.out.println("Is unsortedIntArray sorted? " + ArrayUtil.isSorted(unsortedIntArray));
        System.out.println("Is sortedDateArray sorted? " + ArrayUtil.isSorted(sortedDateArray));
        System.out.println("Is unsortedDateArray sorted? " + ArrayUtil.isSorted(unsortedDateArray));
    }
}
