package randoM;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		/*
		 * Kullanicidan toplanmak uzere sayilar isteyin sayi adedi 10'u gecerse veya
		 * toplam 500'u gecerse "Bu kadar sayi yeter" ".. adet sayi girdin, toplami ..."
		 * yazdirin
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Toplanacak sayilari giriniz:");

		int toplam = 0;
		int sayi = 0;
		int sayac = 1;

		do {
			System.out.print(sayac + ".sayi:");
			sayi = scan.nextInt();

			toplam += sayi;

			sayac++;

		} while (sayac <= 10 && toplam < 500);

		System.out.println("Bu kadar sayi yeter " + (sayac - 1) + " adet sayi girdin, toplami: " + toplam);

		scan.close();
	}

}
