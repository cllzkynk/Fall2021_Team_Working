package randoM;

public class SimpleGameYaziTuraDik {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int yazi = 0;
		int tura = 0;
		int dik = 0;
		int tekrar = 0;

		for (int i = 0; i < 100; i++) {

			double sayi = Math.random();
			if (sayi < 0.5) {
				yazi++;
			} else if (sayi > 0.5) {
				tura++;
			} else {
				dik++;
			}

		}

		System.out.println(yazi);

		System.out.println(tura);

		System.out.println(dik);

	}

}
