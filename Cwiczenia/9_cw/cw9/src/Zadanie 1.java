import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void zadanie1A(){
        Random r = new Random();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow tablicy: ");
        int n = s1.nextInt();
        int tab[] = new int[n];
        int parzyste = 0;
        int nieparzyste = 0;
        for(int i =0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
            if(tab[i]%2==0){
                parzyste+=1;
            }
            if(tab[i]%2!=0) {
                nieparzyste += 1;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Parzystych: "+parzyste);
        System.out.println("Nieparzystych: "+nieparzyste);
    }

    public static void zadanie1B(){
        Random r = new Random();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow tablicy: ");
        int n = s2.nextInt();
        int tab[] = new int[n];
        int ujemne=0,dodatnie=0,zerowe = 0;
        for(int i =0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
            if(tab[i]<0){
                ujemne+=1;
            }
            if(tab[i]>0){
                dodatnie+=1;
            }
            if(tab[i]==0){
                zerowe+=1;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Ujemne: "+ujemne);
        System.out.println("Dodatnie: "+dodatnie);
        System.out.println("Zerowe: "+zerowe);
    }
    public static void zadanie1C(){
        Random r = new Random();
        Scanner s3 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow w tablicy: ");
        int n = s3.nextInt();
        int tab[] = new int[n];
        int max = tab[0];
        int ilerazy = 0;
        for(int i =0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
            if(tab[i]>max){
                max = tab[i];
                ilerazy+=1;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Element max: " + max);
        System.out.println("Ile razy: " + ilerazy);
    }

    public static void zadanie1D(){
        Random r = new Random();
        Scanner s4 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow tablicy: ");
        int n = s4.nextInt();
        int[] tab = new int[n];
        int sumaujemnych = 0;
        int sumadodatnich = 0;
        for(int i =0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
            if(tab[i] < 0){
                sumaujemnych+=tab[i];
            }
            if(tab[i]>0){
                sumadodatnich+=tab[i];
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Suma ujemnych: "+sumaujemnych);
        System.out.println("Suma dodatnich: "+sumadodatnich);
    }
    public static void zadanie1E(){
        Random r = new Random();
        Scanner s5 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow tablicy: ");
        int n = s5.nextInt();
        int[] tab = new int[n];
        int dlugosc = tab[0];
        for(int i =0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;
            if(tab[i]>dlugosc){
                if(tab[i]>0){
                    dlugosc = tab[i];
                }
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Dlugosc: "+tab.length);
    }
    public static void zadanie1F(){
        Random r = new Random();
        Scanner s6 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow tablicy: ");
        int n = s6.nextInt();
        int tab[] = new int[n];
        for(int i=0;i<n;i++) {
            tab[i] = r.nextInt(1999) - 999;
            System.out.println("\nPrzed zmianą: "+Arrays.toString(tab));
            if (tab[i] < 0) {
                tab[i] = -1;
            } else if (tab[i] > 0) {
                tab[i] = 1;
            } else {
                tab[i] = 0;
            }System.out.println("Po zmianie: "+Arrays.toString(tab));
        }
    }
    public static void zadanie1G(){
        int lewy = 0;
        int prawy = 0;
        Random r = new Random();
        Scanner s7 = new Scanner(System.in);
        System.out.println("Ile ma byc elementow tablicy: ");
        int n = s7.nextInt();
        int tab[] = new int[n];
        if (prawy < lewy || lewy < 1 || lewy >= n || prawy >= n)
        {
            System.out.println("Złe liczby.");
            return;
        }
        if(n<lewy){
            System.out.println("Podaj lewy: ");
            lewy = s7.nextInt();
        } else if (n<prawy) {
            System.out.println("Podaj prawy: ");
            prawy = s7.nextInt();
        }
        else{
            System.out.println("Liczba poza skalą.");
        }
        int temp;
        while(lewy<prawy){
            temp = tab[lewy];
            tab[lewy] = tab[prawy];
            tab[prawy] = temp;
            ++lewy;
            --prawy;
        }

        for(int i =0;i<n;i++){
            tab[i] = r.nextInt(1999)-999;

        }
        System.out.println(Arrays.toString(tab));
        System.out.println(lewy);
        System.out.println(prawy);

    }
    public static void main(String[] args){
        //zadanie1A();
        //zadanie1B();
        //zadanie1C();
        //zadanie1D();
        //zadanie1E(); //nie do konca tak ma byc, do spojrzenia potem
        //zadanie1F();
        zadanie1G(); //przekombinowane xd, wróce do tego
    }
}

//    public static void main(String[] args){
//        Random r = new Random();
//        Scanner s = new Scanner(System.in);
//        int n;
//        System.out.print("Ile ma byc elementow tablicy n: ");
//        n = s.nextInt();
//        int[] tab = new int[n];
//
//        for( int i=0;i<n;i++){
//            tab[i] = r.nextInt(1999)-999;
//        }
//        System.out.println(Arrays.toString(tab));
//
//        System.out.print("Zadanie 1a: \n");
//
//        int nieparz = 0;
//        int parz = 0;
//        for(int i =0;i<n;i++){
//            if(tab[i] % 2 == 0)
//            {
//                ++parz;
//            }
//            else
//            {
//                ++nieparz;
//            }
//        }
//        System.out.printf("Parzyste: %d Nieparzyste: %d\n", parz,nieparz);
//
//
//        System.out.print("\nZadanie 1b: \n");
//
//        int dodatnie = 0;
//        int niedodatnie = 0;
//        int zerowe = 0;
//        for (int i =0;i<n;i++)
//        {
//            if(tab[i] < 0){
//                ++niedodatnie;
//            } else if (tab[i] > 0) {
//                ++dodatnie;
//            }
//            else{
//                ++zerowe;
//            }
//        }
//        System.out.printf("Niedodatnie: %d, Dodatnie: %d, Zerowe: %d",niedodatnie,dodatnie,zerowe);
//
//        System.out.print("\nZadanie 1c: \n");
//
//        int max = tab[0];
//        for(int i =0;i<n;i++){
//            if(tab[i] > max){
//                max = tab[i];
//            }
//        }
//        System.out.printf("Max: "+max+"..");
//
//        System.out.print("Zadanie 1d: \n");
//
//        int sumaujemnych = 0;
//        int sumadodatnich = 0;
//        for(int i =0;i<n;i++){
//            if(tab[i]<= 0){
//                sumaujemnych += tab[i];
//            }
//            else{
//                sumadodatnich += tab[i];
//            }
//        }
//        System.out.print("Suma ujemnych: "+sumaujemnych+" Suma dodatnich: "+sumadodatnich);
//        System.out.print("\nZadanie 1e: \n");
//
//        int maksDl = 0;
//        int tym_maks = 0;
//
//        for(int i = 0; i < n; ++i){
//            if(tab[i] < 1){
//                tym_maks = 0;
//                continue;
//            }
//            tym_maks += 1;
//            if ( maksDl < tym_maks){
//                maksDl = tym_maks;
//            }
//        }
//        if(tym_maks > maksDl){
//            maksDl = tym_maks;
//        }
//        System.out.printf("Najdluzszy lancuch dodatnich: %d", maksDl);
//
//        System.out.print("\nZadanie 1f: \n");
//        int minus = -1;
//        int plus = 1;
//        for(int i=0;i<n;i++){
//            if(tab[i] > 1){
//                tab[i] = plus;
//            }
//            else{
//                tab[i] = minus;
//            }
//        }
//        System.out.println(Arrays.toString(tab));
//        System.out.print("\nZadanie 1g: \n");
//
//        int prawy,lewy;
//        System.out.print("Podaj lewy: ");
//        lewy = s.nextInt();
//
//        System.out.print("Podaj prawy: ");
//        prawy = s.nextInt();
//
//        if(lewy >= 1 && lewy < n || prawy >= 1 && prawy < n){
//            System.out.println("Wrong numbers. ");
//            return;
//        }
//
//        int tmp;
//        while(lewy < prawy)
//        {
//            tmp = tab[lewy];
//            tab[lewy] = tab[prawy];
//            tab[prawy] = tmp;
//            ++lewy;
//            --prawy;
//        }
//        System.out.println(Arrays.toString(tab));
//    }
//}