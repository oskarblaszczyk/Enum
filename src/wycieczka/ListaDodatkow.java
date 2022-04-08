package wycieczka;

public enum ListaDodatkow {
    PRZEWODNIK(500 ),
    UBEZPIECZENIE(350),
    WYZYWIENIE(1500),
    NOCLEG(500),
    TRANSFER(150);

    private final int cena;

    ListaDodatkow(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "ListaDodatkow " +
                "cena= " + cena;
    }
}
