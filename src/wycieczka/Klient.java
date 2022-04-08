package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private List<Wyjazd> wyjazdy = new ArrayList<>();
    private static List<Klient> ekstensja = new ArrayList<>();

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        ekstensja.add(this);
    }


// Dwie metody. W kazdej robie to samo.

    //3.387 sekundy
    public static Klient najwiecejWydalWyjazd(List<Klient> klienci) {
        if (klienci == null || klienci.isEmpty()) {
            throw new IllegalArgumentException("nie null i nie pusta");
        }
        Klient najwiecej = klienci.get(0);
        double sumaTemp = 0;
        for (Klient k : klienci) {
            for (Wyjazd w : k.getWyjazdy()) {
                double temp = w.getWycieczka().getCena();
                for (ListaDodatkow d : w.getDodatki()) {
                    temp += d.getCena();
                }
                if (temp > sumaTemp) {
                    najwiecej = k;
                    sumaTemp = temp;
                }
            }
        }
        return najwiecej;
    }

    public static Klient najwiecejWydalDodatki(List<Klient> klienci) {
        if (klienci == null || klienci.isEmpty()) {
            throw new IllegalArgumentException("nie null i nie pusta");
        }
        Klient najwiecej = klienci.get(0);
        double sumaTemp = 0;
        for (Klient k : klienci) {
            for (Wyjazd w : k.getWyjazdy()) {
                double temp = 0;
                for (ListaDodatkow d : w.getDodatki()) {
                    temp += d.getCena();
                }
                if (temp > sumaTemp) {
                    najwiecej = k;
                    sumaTemp = temp;
                }
            }
        }
        return najwiecej;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public List<Wyjazd> getWyjazdy() {
        return wyjazdy;
    }

    public void setWyjazdy(List<Wyjazd> wyjazdy) {
        this.wyjazdy = wyjazdy;
    }

    public static List<Klient> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return "Klient{" + "imie='" + imie + '\'' + ", nazwisko='" + nazwisko + '\'' + '}';
    }
}
