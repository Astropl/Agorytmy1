package Algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main ( String[] args ) {
        int wynik = 0, liczbaWprowadzona =0;
        System.out.println ( Constans.liczymysilnie );
        Scanner sc = new Scanner ( System.in );
        System.out.println ( Constans.podajLiczbeDoSprawdzania );
        liczbaWprowadzona = sc.nextInt ();
        //Spradzenie czy liczba zero
        Silnia silnia = new Silnia ();
                wynik= silnia.silnia ( liczbaWprowadzona );
        System.out.println ("Silnia od :"+liczbaWprowadzona+" to :"+wynik);
    }
}
