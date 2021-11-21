package randoM;

import java.util.Scanner;

public class SearchChar_06 {

	public static void main(String[] args) {

		// soru3 Kullanicidan isim isteyin, eger isim "a" harfi iceriyorsa, girdiginiz
		// isim a harfi iceriyor,
		// eger "Z" harfi iceriyorsa , girdiginiz isim Z harfi iceriyor yazdirin, ikisi
		// de yoksa girdiginiz isim a ve Z harfi icermiyor yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir isim giriniz: ");

		String isim = scan.next();

		if (isim.contains("a") && isim.contains("Z")) { // a ve Z harfinden ikisini de iceriyorsa alt satir
														// calisacak.ikisi ayni anda yoksa else if e gececek.

			System.out.println("Girilen isim a ve Z karakterlerini iceriyor.");

		}

		else if (isim.contains("a") || isim.contains("Z")) { // burada a veya Z olma durumu kontrol edilecek. eger
																// ikisinden biri yoksa en alttaki else calisacak.

			if (isim.contains("a")) {

				System.out.println("girdiginiz isim a harfi iceriyor");

			} else {
				System.out.println("girdiginiz isim Z harfi iceriyor");
			}

		}

		else {

			System.out.println("Girdiginiz isim a ve Z harfi icermiyor..");

		}

		scan.close();

	}

}
