import java.util.Arrays;
import java.util.Scanner;

public class Zadanie2 {
    public static void zadanie2A(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(2A) :");
        int n = scan1.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int temp = 0;
        for(int i =0;i<n;i++){
            int x = scan1.nextInt();
            if(x%2!=0){
                temp+=1;
            }
            System.out.println("Liczba:"+x);
        }
        System.out.println("Ilość twoich liczb nieparzystych: "+temp);
    }
    public static void zadanie2B(){
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(2B) :");
        int n = scan2.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int temp = 0;
        for(int i =0;i<n;i++){
            int x = scan2.nextInt();
            if(x%3 ==0 && x%5!=0){
                temp+=1;
            }
            System.out.println("Liczba: "+x);
        }
        System.out.println("Ilość liczb: " + temp);
    }
    public static void zadanie2C(){
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(2C) :");
        int n = scan3.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int temp =0;
        for(int i =0;i<n;i++){
            int x = scan3.nextInt();
            if(Math.pow(x,2)%2==0){
                temp+=1;
            }
            System.out.println("Liczba: "+x);
        }
        System.out.println("Ilość liczb: " + temp);
    }
    /*public static void zadanie2D(){
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(2D) :");
        int n = scan4.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int temp=0;
        int k =0;
        for(int i =0;i<n;i++){
            if(k>1 && n>k){

            }
        }
    }*/ //poprawic
    /*public static void zadanie2E(){
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(2E) :");
        int n = scan5.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int temp=0;
        int k =0;
        for(int i =0;i<n;i++){
            if(Math.pow(2,k)<)
        }
    }*/ //poprawic
    public static void zadanie2F(){
        Scanner scan6 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(2F) :");
        int n = scan6.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int temp=0;
        for(int i =1;i<n;i++){
            int x = scan6.nextInt();
            if(i%2!=0 && x % 2 ==0){
                temp+=1;
            }
            System.out.println("Liczba: "+x);
        }
        System.out.println("Ilość liczb: "+temp);
    }
    public static void zadanie2G(){
        Scanner scan7 = new Scanner(System.in);
        System.out.println("Podaj liczbe n(2G) :");
        int n = scan7.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj kolejne liczby: ");
        int temp=0;
        for(int i =0;i<n;i++){
            int x = scan7.nextInt();
            if(x%2!=0 && x>= 0){
                temp+=1;
            }
            System.out.println("Liczba: "+x);
        }
        System.out.println("Ilość liczb: "+temp);
    }
    //Nie ma podpunktu H
    //Dalsza czesc zadania drugiego
    public static void zadanie2_2(){
        Scanner scan8 = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna n: ");
        int n = scan8.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj taka ilosc liczb jaka byla poprzednia liczba: ");
        int suma = 0;
        for(int i =0;i<n;i++){
            int x = scan8.nextInt();
            if(x>0){
                suma += (x*2);
            }
            System.out.println("Liczba: "+x);
        }
        System.out.println("Suma podwojona: "+suma);
    }
    public static void zadanie2_3(){
        Scanner scan9 = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna n: ");
        int n = scan9.nextInt();
        System.out.println("Twoja ilosc liczb: " + n);
        System.out.println("Podaj taka ilosc liczb jaka byla poprzednia liczba: ");
        int dodatnie = 0;
        int ujemne = 0;
        int zerowe = 0;
        for(int i =0;i<n;i++){
            int x = scan9.nextInt();
            if(x>0){
                dodatnie+=1;
            }
            if(x<0){
                ujemne+=1;
            }
            if(x==0){
                zerowe+=1;
            }
            System.out.println("Liczba: "+x);
        }
        System.out.println("Ilość liczb dodatnich: "+dodatnie);
        System.out.println("Ilość liczb ujemnych: "+ujemne);
        System.out.println("Ilość liczb zerowych: "+ zerowe);
    }
    public static void zadanie2_4(){
        Scanner scan10 = new Scanner(System.in);
        System.out.print("Ile liczb: ");
        int n = scan10.nextInt();
        int[] tab = new int[n];
        for(int i=0; i<n; i++){
            tab[i] = scan10.nextInt();
            System.out.println("Liczba: "+tab[i]);
        }
        System.out.println(Arrays.toString(tab));
        int min = tab[0];
        int max = tab[0];
        for(int i=0;i<=n-1;i++){
            if(tab[i] < min){
                min = tab[i];
            }
            if(tab[i] > max ){
                max = tab[i];
            }
        }
        System.out.println("Min: " +min);
        System.out.println("Max: " +max);
    }
    public static void zadanie2_5(){
        Scanner scan11 = new Scanner(System.in);
        System.out.print("Ile liczb: ");
        int n = scan11.nextInt();
        int[] tab = new int[n];
        for(int i=0; i<n; i++){
            tab[i] = scan11.nextInt();
            System.out.println("Liczba: "+tab[i]);
        }
        System.out.println(Arrays.toString(tab));
        int parki = 0;
        for(int i =0;i<n-2;i++){
            if(tab[i]>0){
                parki+=1;
            }
        }
        System.out.println("Posiadasz par: "+parki);
    }
    public static void main(String[] args){
        //zadanie2A();
        //zadanie2B();
        //zadanie2C();
        //zadanie2F();
        //zadanie2G();
        //zadanie2_2();
        //zadanie2_3();
        //zadanie2_4();
        zadanie2_5();
    }
}
