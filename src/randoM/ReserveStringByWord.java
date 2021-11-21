package randoM;

import java.util.Scanner;

public class ReserveStringByWord {

	public static void main(String[] args) {
		// kullanicinin girdigi cumlenin kelimelerini tersten yazdirin, orn: Java
		// calisiyorum. cikti: calisiyorum Java (for, substring)

		Scanner scan = new Scanner(System.in);

		System.out.println("Cumle giriniz:");

		String cumle = scan.nextLine();

		String ters = "";

		int sayac = 0;

		for (int i = 0; i < cumle.length(); i++) {

			if (cumle.substring(i, i + 1).equals(" ")) {
				sayac++;
			}

		}
		int sonBosluk = 0;

		for (int i = 1; i <= sayac + 1; i++) {

			if (cumle.contains(" ")) {

				sonBosluk = cumle.lastIndexOf(" "); //
				ters += cumle.substring(sonBosluk + 1) + " ";
				cumle = cumle.substring(0, sonBosluk);

			} else {

				ters += cumle;
			}

		}

		System.out.println(ters);

		scan.close();

	}

}
