import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayUtilM {
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] array, int left, int middle, int right) {
        int size1 = middle - left + 1;
        int size2 = right - middle;
        T[] leftArray = (T[]) new Comparable[size1];
        T[] rightArray = (T[]) new Comparable[size2];
        System.arraycopy(array, left, leftArray, 0, size1);
        System.arraycopy(array, middle + 1, rightArray, 0, size2);
        int i = 0, j = 0, k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < size1) {
            array[k++] = leftArray[i++];
        }
        while (j < size2) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        LocalDate[] localDateArray = {LocalDate.of(2022, 9, 1), LocalDate.of(2022, 5, 12), LocalDate.of(2021, 12, 31), LocalDate.of(2021, 1, 1), LocalDate.of(2021, 7, 8)};

        mergeSort(intArray);
        System.out.println("Posortowana tablica intów: " + Arrays.toString(intArray));

        Arrays.sort(localDateArray, new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Posortowana tablica LocalDate: " + Arrays.toString(localDateArray));
    }
}
