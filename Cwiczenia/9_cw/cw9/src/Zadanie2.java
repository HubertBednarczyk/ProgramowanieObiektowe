import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {

    public static int ileNieparzystych(int tab[]){
        Random r = new Random();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow tablicy: ");
        int n = s1.nextInt();
        tab = new int[n];
        int ile = 0;
        for(int i=0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
            if(tab[i] % 2 !=0){
                ile+=1;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Ilosc nieparzystych: "+ile);
        return ile;
    }


    public static void main(String[] args){
        //ileNieparzystych();
    }
}
