package osoby;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
	//* Stworz klase Osoba, imie nazwisko, kolor oczu, kolor wlosow, pomysl co moze byc enumem.

	private String imie;
	private String nazwisko;
	private KolorOczu kolorOczu;
	private KolorWlosow kolorWlosow;

	private static List<Osoba> ekstensja = new ArrayList<>();

	public Osoba(String imie, String nazwisko, KolorOczu kolorOczu, KolorWlosow kolorWlosow) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kolorOczu = kolorOczu;
		this.kolorWlosow = kolorWlosow;

		ekstensja.add(this);
	}

	//* Napisz ktora zwraca liste osobo o kolorze oczu  podanym jako parametr
	public static List<Osoba> osobyKolorOczu(List<Osoba> osoby, KolorOczu kolor) {
		if (osoby == null) {
			throw new IllegalArgumentException("nie moze byc null");
		}
		List<Osoba> zKolorem = new ArrayList<>();
		for (Osoba o : osoby) {
			if (o.getKolorOczu() == kolor) {
				zKolorem.add(o);
			}
		}
		return zKolorem;
	}

	//* Napisz metod� kt�ra liczy ile jest os�b z kolorem wlosow podanym jako parametr
	public static List<Osoba> osobyKolorWlosow(List<Osoba> osoby, KolorWlosow kolor) {
		if (osoby == null) {
			throw new IllegalArgumentException("nie moze byc null");
		}
		List<Osoba> zKolorem = new ArrayList<>();
		for (Osoba o : osoby) {
			if (o.getKolorWlosow() == kolor) {
				zKolorem.add(o);
			}
		}
		return zKolorem;
	}

	//* Napisz metod� kt�ra zwraca Osobe o najdluzszym nazwisku z oczami podanymi jako parametr

	public static Osoba najdluzszeNazwiskoKolorOczu(List<Osoba> osoby, KolorOczu kolor) {
		if (osoby == null || osoby.isEmpty()) {
			throw new IllegalArgumentException("nie null");
		}
		List<Osoba> zKolorem = new ArrayList<>(Osoba.osobyKolorOczu(osoby, kolor));

		Osoba najdluzsze = zKolorem.get(0);
		for (Osoba o : zKolorem) {
			if (o.getNazwisko().length() > najdluzsze.getNazwisko().length()) {
				najdluzsze = o;
			}
		}
		return najdluzsze;

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

	public KolorOczu getKolorOczu() {
		return kolorOczu;
	}

	public void setKolorOczu(KolorOczu kolorOczu) {
		this.kolorOczu = kolorOczu;
	}

	public KolorWlosow getKolorWlosow() {
		return kolorWlosow;
	}

	public void setKolorWlosow(KolorWlosow kolorWlosow) {
		this.kolorWlosow = kolorWlosow;
	}

	public static List<Osoba> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return imie;
	}

}
