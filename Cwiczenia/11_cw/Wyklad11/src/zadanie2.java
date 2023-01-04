import java.util.ArrayList;
import java.util.Iterator;

public class zadanie2 {

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(4);
        list1.add(9);
        list1.add(16);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(9);
        list2.add(7);
        list2.add(4);
        list2.add(9);
        list2.add(11);
        System.out.print("List1 contents: ");
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.print("List2 contents: ");
        iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        int i = 0;
        int j = 0;
        ArrayList<Integer> merged_list
                = new ArrayList<Integer>();
        while (i < list1.size() && j < list2.size()) {
            merged_list.add(list2.get(j));
            merged_list.add(list1.get(i));
            i++;
            j++;
        }
        while (i < list1.size()) {
            merged_list.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            merged_list.add(list2.get(j));
            j++;
        }
        System.out.println();
        System.out.print("Merged List contents: ");
        iterator = merged_list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
