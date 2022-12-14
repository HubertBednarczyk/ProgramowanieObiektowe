import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n;
        n= s.nextInt();
        int[] tab = new int[n];
        for(int i =0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
        }
        System.out.println(Arrays.toString(tab));
    }
}
