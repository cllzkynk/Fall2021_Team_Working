package randoM;

import java.util.Scanner;

public class CheckForLetter {

	public static void main(String[] args) {

		// Kullanicidan cumle ve harf isteyin, girilen harfin cumle icinde kac tane
		// oldugunu kontrol edin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Icerisinde harf aranacak cumleyi girin:");

		String cumle = scan.nextLine();
		System.out.println("aranacak harfi giriniz");
		String harf = scan.next();

		int sayac = 0;

		for (int i = 0; i < cumle.length(); i++) {

			if (cumle.substring(i, i + 1).equals(harf)) {
				sayac++;
			}

		}
		System.out.println("Girilen cumle icinde \"" + harf + "\" harfi " + sayac + " tane geciyor.");

		scan.close();

	}

}
