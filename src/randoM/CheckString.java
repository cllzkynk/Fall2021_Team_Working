package randoM;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {

		// soru4) Kullanicidan isim ve soyismii girmesini isteyin ve hangisinin daha
		// uzun oldugunu yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen isminizi ve soyisminizi giriniz:\nisim:");

		String isim = scan.next();

		System.out.print("soyisim:");

		String soyIsim = scan.next();

		if (isim.length() > soyIsim.length()) {

			System.out.println("isminiz soyisminizden daha uzun");

		} else if (isim.length() == soyIsim.length()) {

			System.out.println("isminiz soyisminiz ile esit uzunlukta");

		} else {

			System.out.println("soyisminiz isminizden daha uzun");

		}

		// ternary ile
		System.out.println(isim.length() > soyIsim.length() ? "isim daha uzun"
				: (isim.length() < soyIsim.length() ? "soyisim daha uzundur" : "esit uzunlukta"));

		scan.close();

	}

}
