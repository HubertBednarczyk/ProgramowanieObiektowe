import java.util.ArrayList;

public class ArrayListUtil {
    public static <E> void addAll(ArrayList<E> dest, ArrayList<? extends E> src) {
        dest.addAll(src);
    }
}

class ArrayListUtil2 {
    public static <E> void addAll(ArrayList<? super E> dest, ArrayList<E> src) {
        dest.addAll(src);
    }
}
