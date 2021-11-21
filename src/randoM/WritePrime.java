package randoM;

import java.util.Scanner;

public class WritePrime {

	public static void main(String[] args) {
//iki pozitif tam sayi arasindaki asal olan sayilari ve kac tane oldugunu yazdiran kodu yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Iki pozitif tam sayi giriniz:");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int buyuk = 0;
		int kucuk = 0;
		int sayac = 0;

		if (sayi1 > sayi2) {

			buyuk = sayi1;
			kucuk = sayi2;

		} else if (sayi2 > sayi1) {

			buyuk = sayi2;
			kucuk = sayi1;

		} else {
			System.out.println("Girilen sayilar birbirine esit.");
		}

		for (int i = kucuk; i <= buyuk; i++) {

			boolean test = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					test = false;
					break;
				}
			}
			if (test) {
				System.out.print(i + " ");
				sayac++;
			}

		}
		System.out.println("");
		System.out.println(kucuk + " ile " + buyuk + " arasinda " + sayac + " tane asal sayi var.");

		scan.close();
	}

}
