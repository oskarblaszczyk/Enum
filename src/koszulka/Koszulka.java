package koszulka;

public class Koszulka {
	private final String marka;
	private String kolor;
	private RozmiarKoszulki rozmiarKoszulki;
	
	public Koszulka(String marka, String kolor, RozmiarKoszulki rozmiarKoszulki) {	
		this.marka = marka;
		this.kolor = kolor;
		this.rozmiarKoszulki = rozmiarKoszulki;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public RozmiarKoszulki getRozmiarKoszulki() {
		return rozmiarKoszulki;
	}

	public void setRozmiarKoszulki(RozmiarKoszulki rozmiarKoszulki) {
		this.rozmiarKoszulki = rozmiarKoszulki;
	}

	public String getMarka() {
		return marka;
	}

	@Override
	public String toString() {
		return marka + " kolor: " + kolor;
	}
	
	
}
