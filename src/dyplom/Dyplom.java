package dyplom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dyplom {
    private String imie;
    private String nazwisko;
    private final LocalDate dataWystawienia;
    private List<Ocena> oceny = new ArrayList<>();

    private static List<Dyplom> ekstensja = new ArrayList<>();

    public Dyplom(String imie, String nazwisko, LocalDate dataWystawienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataWystawienia = dataWystawienia;
        this.oceny = oceny;

        ekstensja.add(this);
    }

    public static Dyplom najwyzszaSrednia(List<Dyplom> dyplomy) {
        if (dyplomy == null || dyplomy.isEmpty()) {
            throw new IllegalArgumentException("nie null i pusty");
        }
        Dyplom najlepszy = dyplomy.get(0);
        double sredniaTemp = 0;
        for (Dyplom d : dyplomy) {
            double sumaOcen = 0;
            for (Ocena o : d.getOceny()) {
                sumaOcen += o.getOcena().getWartosc();
            }

            double srednia = sumaOcen / d.getOceny().size();
            if (srednia > sredniaTemp) {
                najlepszy = d;
                sredniaTemp = srednia;
            }
        }
        return najlepszy;
    }

    public static Dyplom najwyzszaSrednia2(List<Dyplom> dyplomy) {
        if (dyplomy == null || dyplomy.isEmpty()) {
            throw new IllegalArgumentException("nie null i pusty");
        }
        Dyplom najlepszy = dyplomy.get(0);
        double sredniaTemp = najlepszy.sredniaOcena();
        for (Dyplom d : dyplomy) {
            double srednia = d.sredniaOcena();
            if (srednia > sredniaTemp) {
                najlepszy = d;
                sredniaTemp = srednia;
            }
        }
        return najlepszy;
    }

    public double sredniaOcena() {
        double sumaOcen = 0;
        for (Ocena o : oceny) {
            sumaOcen += o.getOcena().getWartosc();
        }
        return sumaOcen / oceny.size();
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

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }


    public List<Ocena> getOceny() {
        return oceny;
    }

    public void setOceny(List<Ocena> oceny) {
        this.oceny = oceny;
    }

    public static List<Dyplom> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return "Dyplom{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
