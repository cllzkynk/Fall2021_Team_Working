package randoM;

import java.util.Scanner;

public class BigOrSmallLetter {

	public static void main(String[] args) {

		// Kullanicinin girdigi kelimedeki buyuk ve kucuk harf sayisini ekrana yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kontrol edilecek kelimeyi giriniz:");
		String kelime = scan.nextLine();

		String buyuk = "";
		String kucuk = "";
		char harf = ' ';

		for (int i = 0; i < kelime.length(); i++) {

			harf = kelime.charAt(i);

			if (harf >= 'A' && harf <= 'Z') {

				buyuk += harf;

			}

		}

		for (int i = 0; i < kelime.length(); i++) {

			harf = kelime.charAt(i);

			if (harf >= 'a' && harf <= 'z') {

				kucuk += harf;

			}

		}

		System.out.println("Buyuk harf sayisi: " + buyuk.length());
		System.out.println("Kucuk harf sayisi: " + kucuk.length());
		System.out.println("Diger karakter sayisi: " + (kelime.length() - buyuk.length() - kucuk.length()));

		scan.close();
	}
}
