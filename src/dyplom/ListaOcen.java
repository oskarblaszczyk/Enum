package dyplom;

public enum ListaOcen {
    NIEDOSTATECZNY(1), DOPUSZCZAJACY(2), DOSTATECZNY(3), DOBRY(4), BARDZO_DOBRY(5), CELUJACY(6);

    private final int wartosc;

    ListaOcen(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }

    @Override
    public String toString() {
        return "ListaOcen{" +
                "wartosc=" + wartosc +
                '}';
    }
}
