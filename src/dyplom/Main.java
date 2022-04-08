package dyplom;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dyplom d1 = new Dyplom("Adam", "Kowalski", LocalDate.now());
        Ocena o1 = new Ocena(ListaOcen.DOBRY, ListaPrzedmiotow.JEZYK_POLSKI, d1);
        Ocena o2 = new Ocena(ListaOcen.CELUJACY, ListaPrzedmiotow.MATEMATYKA, d1);
        Ocena o3 = new Ocena(ListaOcen.NIEDOSTATECZNY, ListaPrzedmiotow.BIOLOGIA, d1);
        Ocena o4 = new Ocena(ListaOcen.DOPUSZCZAJACY, ListaPrzedmiotow.FIZYKA, d1);
        Ocena o5 = new Ocena(ListaOcen.BARDZO_DOBRY, ListaPrzedmiotow.CHEMIA, d1);


        Dyplom d2 = new Dyplom("Piotr", "Nowak", LocalDate.now());
        Ocena o6 = new Ocena(ListaOcen.DOBRY, ListaPrzedmiotow.JEZYK_POLSKI, d2);
        Ocena o7 = new Ocena(ListaOcen.CELUJACY, ListaPrzedmiotow.MATEMATYKA, d2);
        Ocena o8 = new Ocena(ListaOcen.NIEDOSTATECZNY, ListaPrzedmiotow.BIOLOGIA, d2);
        Ocena o9 = new Ocena(ListaOcen.DOPUSZCZAJACY, ListaPrzedmiotow.FIZYKA, d2);
        Ocena o10 = new Ocena(ListaOcen.BARDZO_DOBRY, ListaPrzedmiotow.CHEMIA, d2);


        System.out.println(d1.sredniaOcena());
        System.out.println(d2.sredniaOcena());
        System.out.println(Dyplom.najwyzszaSrednia(Dyplom.getEkstensja()));
        System.out.println(Dyplom.najwyzszaSrednia2(Dyplom.getEkstensja()));
        dodajOcene(ListaOcen.DOSTATECZNY, ListaPrzedmiotow.BIOLOGIA, d1);
        dodajOcene(ListaOcen.DOSTATECZNY, ListaPrzedmiotow.BIOLOGIA, d1);
        System.out.println(d1.getOceny());
        System.out.println(Ocena.getEkstensja());

    }
    public static void dodajOcene(ListaOcen ocena, ListaPrzedmiotow przedmiot, Dyplom dyplom){
        String nazwa= "n1";
        Ocena n1 = new Ocena(ocena, przedmiot, dyplom);
    }

}
