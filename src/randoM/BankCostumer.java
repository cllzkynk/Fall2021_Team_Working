package randoM;

import java.util.Scanner;

public class BankCostumer {

	public static void main(String[] args) {

		/*
		 * Soru4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen isminizi giriniz: ");

		String isim = scan.next();

		System.out.println("Soy isminizi giriniz : ");

		String soyIsim = scan.next();

		System.out.println("16 haneli Kredi karti numaranizi aralarinda bosluk birakmadan giriniz : ");

		String kart = scan.next();

		if (kart.contains(" ") || kart.length() != 16) {

			System.out.println("Kart numarasini aralarda bosluk birakmadan ve 16 haneli olarak giriniz.");

		} else {

			System.out.println(duzeltIsim(isim, soyIsim));

			System.out.println(kart(kart));

		}

		scan.close();

	}

	public static String duzeltIsim(String str1, String str2) {

		String str3 = "Adiniz: " + str1.toUpperCase().substring(0, 1) + str1.toLowerCase().substring(1, str1.length())
				+ "\nSoyadiniz: " + str2.toUpperCase().substring(0, 1) + str2.toLowerCase().substring(1, str2.length());

		return str3;
	}

	public static String kart(String a) {

		a = "Kart numaraniz: " + a.substring(0, 4) + "  " + a.substring(4, 8) + "  " + a.substring(8, 12) + "  "
				+ a.substring(12, 16);

		return a;
	}

}
