package randoM;

import java.util.Scanner;

public class CheckSentences {

	public static void main(String[] args) {
		// Kullanicidan cumle ve kelime isteyin, girilen kelimenin cumle icinde olup
		// olmadigini kontrol edin.

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen icinde arama yapilacak cumleyi giriniz:");
		String cumle = scan.nextLine();
		System.out.print("Cumle icinde aranacak harf veya kelimeyi giriniz:");
		String kelime = scan.next();

		if (cumle.contains(kelime)) {

			System.out.println(cumle + " \ncumlesi icinde \"" + kelime + "\" ifadesi iceriyor.");

		} else {

			System.out.println(cumle + " \ncumlesi icinde \"" + kelime + "\" ifadesi ICERMIYOR.");
		}

		scan.close();
	}

}
