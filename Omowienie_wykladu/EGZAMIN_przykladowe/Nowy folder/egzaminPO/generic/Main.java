import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pair<Integer,Double>para=new Pair<>(11,3.03);
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());
        Pair<Integer,Double>nowa=PairUtil.swap(para);
        System.out.println(nowa.getFirst());
        System.out.println(nowa.getSecond());

        Integer[] sorted_Integer={1,2,3,4};
        Integer[] unsorted_Integer={4,3,2,1};

        System.out.println(ArrayUtil.isSorted(sorted_Integer));
        System.out.println(ArrayUtil.isSorted(unsorted_Integer));
        System.out.println(ArrayUtil.binSearch(sorted_Integer,5));

        ArrayUtil.selectionSort(unsorted_Integer);
        for(Integer i: unsorted_Integer){
            System.out.print(i);
        }

    }
}