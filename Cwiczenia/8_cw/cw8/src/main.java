import java.util.Scanner;
import java.lang.Math;

class Javaz01{
    public static void zadanie1A(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1A) :");
        int n = scan1.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int suma = 0;
        for(int i =0;i<n;i++){
            int x = scan1.nextInt();
            System.out.println("Liczba:  " + x);
            suma += x;
        }
        System.out.println("Oto twoje dodane liczby: "+ suma);
    }

    public static void zadanie1B(){
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan2.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int iloczyn = 1;
        for(int i =0;i<n;i++){
            int x = scan2.nextInt();
            System.out.println("Liczba:  " + x);
            iloczyn *= x;
        }
        System.out.println("Oto twoje dodane liczby: "+ iloczyn);
    }

    public static void zadanie1C(){
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan3.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int sumawartoscbezw = 0;
        for(int i =0;i<n;i++){
            int x = scan3.nextInt();
            System.out.println("Liczba:  " + x);
            sumawartoscbezw += Math.abs(x);
        }
        System.out.println("Oto twoje dodane liczby: "+ sumawartoscbezw);
    }

    public static void zadanie1D(){
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan4.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int sumawartoscbezwpierwiastek = 0;
        for(int i =0;i<n;i++){
            int x = scan4.nextInt();
            System.out.println("Liczba:  " + x);
            sumawartoscbezwpierwiastek += Math.sqrt(Math.abs(x));
        }
        System.out.println("Oto twoje dodane liczby: "+ sumawartoscbezwpierwiastek);
    }

    public static void zadanie1E(){
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan5.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int mnozeniewartoscbezwzgledna = 1;
        for(int i =0;i<n;i++){
            int x = scan5.nextInt();
            System.out.println("Liczba:  " + x);
            mnozeniewartoscbezwzgledna *= Math.abs(x);
        }
        System.out.println("Oto twoje dodane liczby: "+ mnozeniewartoscbezwzgledna);
    }

    public static void zadanie1F(){
        Scanner scan6 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan6.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int dodawaniepoteg = 0;
        for(int i =0;i<n;i++){
            int x = scan6.nextInt();
            System.out.println("Liczba:  " + x);
            dodawaniepoteg += Math.pow(x, 2);
        }
        System.out.println("Oto twoje dodane liczby: "+ dodawaniepoteg);
    }

    public static void zadanie1G(){
        Scanner scan7 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan7.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int dodawanie = 0;
        int mnozenie = 1;
        for(int i =0;i<n;i++){
            int x = scan7.nextInt();
            System.out.println("Liczba:  " + x);
            dodawanie += x;
            mnozenie *= x;
        }
        System.out.println("Oto twoje dodane liczby: "+ dodawanie);
        System.out.println("Oto twoje pomnozone liczby: "+ mnozenie);
    }

    public static void zadanie1H(){
        Scanner scan8 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan8.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int dodawanie = 0;
        int odejmowanie = 0;
        for(int i =0;i<n;i++){
            int x = scan8.nextInt();
            System.out.println("Liczba:  " + x);
            odejmowanie -= x;
        }
        System.out.println("Oto twoje dodane liczby: " + dodawanie);
    }

    public static void zadanie1I(){
        Scanner scan9 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(1B) :");
        int n = scan9.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int dodawanie = 0;
        int odejmowanie = 0;
        for(int i =0;i<n;i++){
            int x = scan9.nextInt();
            System.out.println("Liczba:  " + x);
            odejmowanie -= x;
        }
        System.out.println("Oto twoje dodane liczby: " + dodawanie);
    }

    public static void zadanie1_2(){
        Scanner scan10 = new Scanner(System.in);
        System.out.println("Podaj liczbe n: \n");
        int n = scan10.nextInt();
        System.out.println("Podaj "+n+" liczby: ");
        for(int i =0;i<n;i++){
            int x = scan10.nextInt();
            System.out.println("Liczba: "+x);
        }
        int[] array = {10,5,30,25};

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tutaj podajesz liczbe n: ");
        int n = scan.nextInt();
        System.out.println("To był taki przyklad, oto twoja liczba:  " + n);
        System.out.println("Lecimy do pierwszego podpunktu!");

        //zadanie1A();
        //zadanie1B();
        //zadanie1C();
        //zadanie1D();
        //zadanie1E();
        //zadanie1F();
        //zadanie1G();
        //zadanie1H();//poprawic
        //zadanie1I(); //poprawic
        zadanie1_2();
    }
}
