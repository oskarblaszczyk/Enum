package koszulka;

public class Main {

	public static void main(String[] args) {

		Koszulka k1 = new Koszulka("Adidas", "Czerwony", RozmiarKoszulki.L);		
		System.out.println(k1);
		
		System.out.println(k1.getRozmiarKoszulki().name());
		
		System.out.println(k1.getRozmiarKoszulki().ordinal());
		
		System.out.println(RozmiarKoszulki.valueOf(k1.getRozmiarKoszulki().name()));
		
		for(RozmiarKoszulki r : RozmiarKoszulki.values()) {
			System.out.println(r.name() + " " + r);
		}
	}

}
