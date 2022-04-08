package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Wyjazd {
    private Klient klient;
    private Wycieczka wycieczka;
    private List<ListaDodatkow> dodatki = new ArrayList<>();
    private static List<Wyjazd> ekstensja = new ArrayList<>();

    public Wyjazd(Klient klient, Wycieczka wycieczka, List<ListaDodatkow> dodatki) {
        this.klient = klient;
        this.wycieczka = wycieczka;
        this.dodatki = dodatki;

        ekstensja.add(this);
        klient.getWyjazdy().add(this);
        wycieczka.getWyjazdy().add(this);
    }

    //2.974(1.950) sekundy
    public static Klient najdrozszyWyjazd(List<Wyjazd> wyjazdy) {
        if (wyjazdy == null || wyjazdy.isEmpty()) {
            throw new IllegalArgumentException("nie null i nie pusta");
        }
        Wyjazd n = wyjazdy.get(0);
        double wartosc = n.wartoscDodatkow(); //zapisanie do zmiennej aby nie wywolywac metody w petli bez potrzeby
        for (Wyjazd w : wyjazdy) {
            double wartosc2 = w.wartoscDodatkow(); //raz wywolujemy metode zamiast 2 razy (if oraz ewentualne przypisanie)
            if ((w.getWycieczka().getCena() + wartosc2) > (n.getWycieczka().getCena() + wartosc)) {
                n = w;
                wartosc = wartosc2;
            }
        }
        return n.getKlient();
    }

    //3.489 (3.785) sekundy przy liscie z dwoma wyjazdami
    public static Klient najdrozszyWyjazd2(List<Wyjazd> wyjazdy) {
        if (wyjazdy == null || wyjazdy.isEmpty()) {
            throw new IllegalArgumentException("nie null i nie pusta");
        }
        Wyjazd n = wyjazdy.get(0);
        for (Wyjazd w : wyjazdy) {
               if ((w.getWycieczka().getCena() + w.wartoscDodatkow()) > (n.getWycieczka().getCena() + w.wartoscDodatkow())) {
                n = w;
            }
        }
        return n.getKlient();
    }

    public static Klient najdrozszeDodatki(List<Wyjazd> wyjazdy) {
        if (wyjazdy == null || wyjazdy.isEmpty()) {
            throw new IllegalArgumentException("nie null i nie pusta");
        }
        Wyjazd n = wyjazdy.get(0);
        double wartosc = n.wartoscDodatkow();
        for (Wyjazd w : wyjazdy) {
            double wartosc2 = w.wartoscDodatkow();
            if (wartosc2 > wartosc) {
                n = w;
                wartosc = wartosc2;
            }
        }
        return n.getKlient();
    }

    public double wartoscDodatkow() {
        double suma = 0;
        for (ListaDodatkow d : dodatki) {
            suma += d.getCena();
        }
        return suma;
    }

    public Klient getKlient() {
        return klient;
    }

    public Wycieczka getWycieczka() {
        return wycieczka;
    }

    public static List<Wyjazd> getEkstensja() {
        return ekstensja;
    }

    public List<ListaDodatkow> getDodatki() {
        return dodatki;
    }

    public void setDodatki(List<ListaDodatkow> dodatki) {
        this.dodatki = dodatki;
    }

    @Override
    public String toString() {
        return "Wyjazd{" + "klient=" + klient + ", wycieczka=" + wycieczka + '}';
    }
}
