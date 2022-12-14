import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Ile ma byc elementow tablicy n: ");
        n = s.nextInt();
        int[] tab = new int[n];

        for( int i=0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
        }
        System.out.println(Arrays.toString(tab));

        System.out.print("Zadanie 1a: \n");

        int nieparz = 0;
        int parz = 0;
        for(int i =0;i<n;i++){
            if(tab[i] % 2 == 0)
            {
                ++parz;
            }
            else
            {
                ++nieparz;
            }
        }
        System.out.printf("Parzyste: %d Nieparzyste: %d\n", parz,nieparz);


        System.out.print("\nZadanie 1b: \n");

        int dodatnie = 0;
        int niedodatnie = 0;
        int zerowe = 0;
        for (int i =0;i<n;i++)
        {
            if(tab[i] < 0){
                ++niedodatnie;
            } else if (tab[i] > 0) {
                ++dodatnie;
            }
            else{
                ++zerowe;
            }
        }
        System.out.printf("Niedodatnie: %d, Dodatnie: %d, Zerowe: %d",niedodatnie,dodatnie,zerowe);

        System.out.print("\nZadanie 1c: \n");

        int max = tab[0];
        for(int i =0;i<n;i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        System.out.printf("Max: "+max+"..");

        System.out.print("Zadanie 1d: \n");

        int sumaujemnych = 0;
        int sumadodatnich = 0;
        for(int i =0;i<n;i++){
            if(tab[i]<= 0){
                sumaujemnych += tab[i];
            }
            else{
                sumadodatnich += tab[i];
            }
        }
        System.out.print("Suma ujemnych: "+sumaujemnych+" Suma dodatnich: "+sumadodatnich);
        System.out.print("\nZadanie 1e: \n");

        int maksDl = 0;
        int tym_maks = 0;

        for(int i = 0; i < n; ++i){
            if(tab[i] < 1){
                tym_maks = 0;
                continue;
            }
            tym_maks += 1;
            if ( maksDl < tym_maks){
                maksDl = tym_maks;
            }
        }
        if(tym_maks > maksDl){
            maksDl = tym_maks;
        }
        System.out.printf("Najdluzszy lancuch dodatnich: %d", maksDl);

        System.out.print("\nZadanie 1f: \n");
        int minus = -1;
        int plus = 1;
        for(int i=0;i<n;i++){
            if(tab[i] > 1){
                tab[i] = plus;
            }
            else{
                tab[i] = minus;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.print("\nZadanie 1g: \n");

        int prawy,lewy;
        System.out.print("Podaj lewy: ");
        lewy = s.nextInt();

        System.out.print("Podaj prawy: ");
        prawy = s.nextInt();

        if(lewy >= 1 && lewy < n || prawy >= 1 && prawy < n){
            System.out.println("Wrong numbers. ");
            return;
        }

        int tmp;
        while(lewy < prawy)
        {
            tmp = tab[lewy];
            tab[lewy] = tab[prawy];
            tab[prawy] = tmp;
            ++lewy;
            --prawy;
        }
        System.out.println(Arrays.toString(tab));
    }
}