package randoM;

import java.util.Scanner;

public class SekilOlusturma {

	public static void main(String[] args) {

		/*
		 * Problem Tanýmý Girilen bir sayý kadar satýr ve sütünu olan ve sað kenara
		 * dayalý üçgeni basan kodu yazýnýz. Ekran Çýktýsý Bir sayi giriniz: 5
		 *
		 **
		 ***
		 ****
		 *****
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Sayi giriniz:");

		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		scan.close();

	}

}
