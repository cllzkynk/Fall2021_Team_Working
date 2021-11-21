package randoM;

import java.util.Scanner;

public class Calisma_01_SoyAdi_Kontrol {

	public static void main(String[] args) {

		// Kullanýcýdan soyadýný ve cinsiyetini girmesini isteyin
		// Eðer soyadý ov veya ova ile bitmiyorsa "Soyad girisi yanlis" yazdýrýn
		// ov ile bitiyorsa ve cinsiyetini doðru (örneðin Erkek) girdiyse "dogru giris"
		// ova ile bitiyorsa ve cinsiyetini doðru (örneðin Bayan) girdiyse de "dogru
		// giris"
		// diðer durumlarda "yanlýs giris" yazdýrýn

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen soyadinizi giriniz:\nSoyad: ");

		String soyAdi = scan.nextLine();

		System.out.print("Lutfen cinsiyetinizi giriniz:\nCinsiyet: ");

		String cinsiyet = scan.next();

		int uzunluk = soyAdi.length();

		int indexOv = soyAdi.lastIndexOf("ov");

		if (indexOv >= 0) {

			if (indexOv == uzunluk - 2 || indexOv == uzunluk - 3) {

				if (cinsiyet.equalsIgnoreCase("Erkek") || cinsiyet.equalsIgnoreCase("Kadin")) {

					System.out.println(
							"Dogru giris, soyadinin sonunda ov veya ova kelimesi var ve cinsiyet dogru girilmis.");

				} else {
					System.out.println("Soyadinin sonunda ov veya ova kelimesi var fakat cinsiyet yanlis girilmis.");
				}

			} else {
				System.out.println("Soyadinin sonunda ov veya ova kelimesi bulunamadi");
			}

		} else {
			System.out.println("Soyadinda ov veya ova kelimesi bulunamadi.");
		}

		scan.close();

	}

}
