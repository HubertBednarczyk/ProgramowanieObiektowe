import java.util.ArrayList;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i].compareTo(array[i+1])>0){
                return false;
            }
        }
        return true;

    }

    public static <E> void addAll(ArrayList<? extends E> source, ArrayList<E> destination) {
        destination.addAll(source);
    }

    public static <E> void addAll_super(ArrayList<E> source, ArrayList<? super E> destination) {
        destination.addAll(source);
    }

    public static <T extends Comparable<T>> int binSearch(T[] array, T element){
        for(int i=0; i<array.length; i++){
            if(array[i].compareTo(element)==0){
                return 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
