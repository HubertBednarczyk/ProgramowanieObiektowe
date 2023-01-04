import java.util.ArrayList;
import java.util.Arrays;


public class zadanie5 {
    public static void reverse (ArrayList<Integer> a){
        for(int i = 0; i < a.size()/2; ++i){
            int tmp = a.get(i);
            a.set(i,a.get(a.size()-i-1));
            a.set(a.size()-i-1, tmp);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 9, 16, 5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9, 7, 4, 9, 11));
        reverse(a);
    }
}
