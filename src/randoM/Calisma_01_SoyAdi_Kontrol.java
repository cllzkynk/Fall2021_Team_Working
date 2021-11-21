package randoM;

import java.util.Scanner;

public class Calisma_01_SoyAdi_Kontrol {

	public static void main(String[] args) {

		// Kullan�c�dan soyad�n� ve cinsiyetini girmesini isteyin
		// E�er soyad� ov veya ova ile bitmiyorsa "Soyad girisi yanlis" yazd�r�n
		// ov ile bitiyorsa ve cinsiyetini do�ru (�rne�in Erkek) girdiyse "dogru giris"
		// ova ile bitiyorsa ve cinsiyetini do�ru (�rne�in Bayan) girdiyse de "dogru
		// giris"
		// di�er durumlarda "yanl�s giris" yazd�r�n

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
