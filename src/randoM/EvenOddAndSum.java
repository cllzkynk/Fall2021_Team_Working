package randoM;

import java.util.Scanner;

public class EvenOddAndSum {

	public static void main(String[] args) {

		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini,100’den kucukse sadece 1’ler
		 * basamagini yazdiran 3 method olusturun.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz: ");

		int sy = scan.nextInt();

		tekCift(sy); // methodu cagirdik.

		pozitif(sy); // methodu cagirdik.

		yuzdenBuyuk(sy); // methodu cagirdik.

		scan.close();
		
		
		
		
		

	} // main method sonu

	public static void tekCift(int sayi) {

		if (sayi % 2 == 0) {
			System.out.println("Girilen sayi cift");
		} else {

			System.out.println("Girilen sayi tek");

		}

	}

	public static void pozitif(int sayi) {

		if (sayi > 0) {
			System.out.println("Girilen sayi pozitif");
		} else {
			System.out.println("Girilen sayi negatif");

		}
	}

	public static void yuzdenBuyuk(int sayi) {

		if (sayi > 100 && sayi < 1000) {
			System.out.println("Sayinin birler onlar ve yuzler basamagi toplami: "
					+ (sayi % 10 + (sayi / 10) % 10 + (sayi / 100)));
		} else if (sayi > 999) {
			System.out.println("Sayinin birler onlar ve yuzler basamagi toplami: "
					+ (sayi % 10 + (sayi / 10) % 10 + (sayi / 100) % 10));

		} else {
			System.out.println("Sayinin birler basamagi: " + sayi % 10);

		}

	}

}// class sonu
