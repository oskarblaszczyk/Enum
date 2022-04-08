package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Wycieczka {
    private String nazwa;
    private String kraj;
    private double cena;
    private List<ListaDodatkow> dodatki = new ArrayList<>();
    private List<Wyjazd> wyjazdy = new ArrayList<>();
    private List<Wycieczka> ekstensja = new ArrayList<>();

    public Wycieczka(String nazwa, String kraj, double cena) {
        this.nazwa = nazwa;
        this.kraj = kraj;
        this.cena = cena;
        ekstensja.add(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public List<ListaDodatkow> getDodatki() {
        return dodatki;
    }

    public void setDodatki(List<ListaDodatkow> dodatki) {
        this.dodatki = dodatki;
    }

    public List<Wyjazd> getWyjazdy() {
        return wyjazdy;
    }

    public void setWyjazdy(List<Wyjazd> wyjazdy) {
        this.wyjazdy = wyjazdy;
    }

    public List<Wycieczka> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
