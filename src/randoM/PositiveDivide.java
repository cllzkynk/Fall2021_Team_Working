package randoM;

import java.util.Scanner;

public class PositiveDivide {

	public static void main(String[] args) {

		// Girilen sayinin pozitif tam bolenlerini yazdiran kodu yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif sayi giriniz:");
		int sayi = scan.nextInt();
		int sayac = 0;

		for (int i = 1; i <= sayi; i++) {

			if (sayi % i == 0) {
				System.out.print(i + " ");
				sayac++;
			}

		}

		System.out.println("");
		System.out.println(sayi + " nin " + sayac + " tane pozitif tam boleni var");

		scan.close();
	}

}
