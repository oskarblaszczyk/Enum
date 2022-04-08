package dyplom;

import java.util.ArrayList;
import java.util.List;

public class Ocena {
    private ListaOcen ocena;
    private ListaPrzedmiotow przedmiot;
    private Dyplom dyplom;

    private static List<Ocena> ekstensja = new ArrayList<>();

    public Ocena(ListaOcen ocena, ListaPrzedmiotow przedmiot, Dyplom dyplom) {
        this.ocena = ocena;
        this.przedmiot = przedmiot;
        this.dyplom = dyplom;
        dyplom.getOceny().add(this);
        ekstensja.add(this);
    }

    public ListaOcen getOcena() {
        return ocena;
    }

    public void setOcena(ListaOcen ocena) {
        this.ocena = ocena;
    }

    public ListaPrzedmiotow getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(ListaPrzedmiotow przedmiot) {
        this.przedmiot = przedmiot;
    }

    public Dyplom getDyplom() {
        return dyplom;
    }

    public void setDyplom(Dyplom dyplom) {
        this.dyplom = dyplom;
    }

    public static List<Ocena> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "ocena=" + ocena +
                ", przedmiot=" + przedmiot +
                '}';
    }
}
