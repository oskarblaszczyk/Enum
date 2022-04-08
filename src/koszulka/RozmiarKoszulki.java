package koszulka;

public enum RozmiarKoszulki {

	S(40, 50), M(50, 60), L(60, 70), XL(80, 90);

	private final int obwod;
	private final int dlugosc;

	private RozmiarKoszulki(int obwod, int dlugosc) {
		this.obwod = obwod;
		this.dlugosc = dlugosc;
	}

	public int getObwod() {
		return obwod;
	}

	public int getDlugosc() {
		return dlugosc;
	}

	public String toString() {
		return obwod + " " + dlugosc;
	}

}
