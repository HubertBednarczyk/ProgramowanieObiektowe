import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zadanie3 {
    public static void mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        a.addAll(b);
        Collections.sort(a);
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("How many elements in list a? :");
        int m = s1.nextInt();
        System.out.println("How many elements in list b? :");
        int n = s1.nextInt();
        ArrayList<Integer> a = new ArrayList<>(m);
        ArrayList<java.lang.Integer> b = new ArrayList<>(n);
        System.out.println("Please add "+m+" elements to list a:");
        for(int i =0;i<m;i++){
            a.add(s1.nextInt());
        }
        System.out.println("Please add "+n+" elements to list b:");
        for(int i =0;i<n;i++){
            b.add(s1.nextInt());
        }
        mergeSorted(a,b);
    }
}
