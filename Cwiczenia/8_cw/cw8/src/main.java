import java.util.Scanner;
import java.lang.Math;
class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int x = scan.nextInt();
        System.out.println("Podaj liczby n: ");
        int suma = 0;
        int iloczyn = 1;
        int bezwzgledna = 0;
        int bezwzglednapierw = 0;
        int bezwzglednamnozenie = 1;
        int dodawaniekwadratow = 0;
//        int gdodawanie = 0;
//        int gmnozenie = 1;
        for(int i=0;i<x;i++)
        {
            int n = scan.nextInt();
            System.out.println("Liczba:  " + n);
            suma+=n;
            iloczyn*=n;
            bezwzgledna+=n;
            bezwzglednapierw+=n;
            bezwzglednamnozenie*=n;
            n=n*n;
            dodawaniekwadratow += n;
//            gdodawanie += n;
//            gmnozenie *= n;
            
        }
        System.out.println("Suma: " + suma);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("bezwzgledna: " + Math.abs(bezwzgledna));
        System.out.println("bezwzglednapierw: " + Math.sqrt(Math.abs(bezwzglednapierw)));
        System.out.println("bezwzglednamnozenie: " + Math.abs(bezwzglednamnozenie));
        System.out.println("dodawaniekwadratow: " + dodawaniekwadratow);
//        System.out.println("gdodawanie: " + gdodawanie + "\ngmnozenie" + gmnozenie);

    }

}