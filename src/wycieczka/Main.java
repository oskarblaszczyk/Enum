/*
 * Stwórz klase klient i wycieczka, klient moze miec wiele wycieczek, wycieczka
 * moze miec wielu klientow. Wycieczka ma nazwe, kraj, cena i liste dodatkow
 * (kazdy jest dodatkowo platny) Znadz klienta który wydal najwiecej na dodatki
 * do wycieczki uwzgledniajac tez cene wycieczki Znadz klienta który wydal
 * najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
 */

package wycieczka;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Klient k1 = new Klient("Jan", "Kowalski");
        Klient k2 = new Klient("Adam", "Nowak");

        Wycieczka w1 = new Wycieczka("Piramidy", "Egipt", 3500);
        Wycieczka w2 = new Wycieczka("Bieszczady", "Polska", 2150);

        Wyjazd p1 = new Wyjazd(k2, w1, Arrays.asList(ListaDodatkow.NOCLEG, ListaDodatkow.PRZEWODNIK, ListaDodatkow.TRANSFER, ListaDodatkow.WYZYWIENIE));
        Wyjazd p2 = new Wyjazd(k1, w2, Arrays.asList(ListaDodatkow.WYZYWIENIE, ListaDodatkow.NOCLEG, ListaDodatkow.WYZYWIENIE));


        System.out.println(Wyjazd.najdrozszyWyjazd(Wyjazd.getEkstensja()));
        System.out.println(Klient.najwiecejWydalWyjazd(Klient.getEkstensja()));

        System.out.println(Wyjazd.najdrozszeDodatki(Wyjazd.getEkstensja()));
        System.out.println(Klient.najwiecejWydalDodatki(Klient.getEkstensja()));

    }
}
