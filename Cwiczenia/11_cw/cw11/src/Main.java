import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void appendz1(ArrayList<Integer> a,ArrayList<Integer> b){

        a.addAll(b);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("How many elements in list a? :");
        int m = numbers.nextInt();
        System.out.println("How many elements in list b? :");
        int n = numbers.nextInt();
        ArrayList<java.lang.Integer> a = new ArrayList<>(m);
        ArrayList<java.lang.Integer> b = new ArrayList<>(n);
        System.out.println("Please add "+m+" elements to list a:");
        for(int i =0;i<m;i++){
            a.add(numbers.nextInt());
        }
        System.out.println("Please add "+n+" elements to list b:");
        for(int i =0;i<n;i++){
            b.add(numbers.nextInt());
        }
        System.out.println(a);
        System.out.println(b);
        appendz1(a,b);
    }
}