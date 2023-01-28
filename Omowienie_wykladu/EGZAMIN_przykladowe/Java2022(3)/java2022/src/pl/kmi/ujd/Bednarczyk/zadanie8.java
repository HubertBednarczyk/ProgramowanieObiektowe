package pl.kmi.ujd.Bednarczyk;

import java.util.Set;
import java.util.HashSet;

public class zadanie8 {

    public static Set<Integer> primesUpTo(int n) {
        Set<Integer> primes = new HashSet<>();

        // wstawienie liczb od 2 do n
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }

        // usunięcie wielokrotności liczby 2 (z wyjątkiem 2)
        for (int i = 4; i <= n; i += 2) {
            primes.remove(i);
        }

        // usunięcie wielokrotności liczby 3 (z wyjątkiem 3) itd.
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (primes.contains(i)) {
                for (int j = i * i; j <= n; j += i) {
                    primes.remove(j);
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 30;
        Set<Integer> primes = primesUpTo(n);
        System.out.println("Liczby pierwsze mniejsze od " + n + " to: " + primes);
    }
}
