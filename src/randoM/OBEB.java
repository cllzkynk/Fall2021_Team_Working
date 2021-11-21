package randoM;

import java.util.Scanner;

public class OBEB {

	public static void main(String[] args) {

		// girilen iki tam sayiyi tam bolen en buyuk sayiyi bulan kodu yaziniz. (OBEB)

		Scanner scan = new Scanner(System.in);
		System.out.println("En buyuk ortak boleni hesaplamak istediginiz iki sayiyi giriniz:");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		boolean test = true;

		for (int i = sayi1; i > 1; i--) {

			if (sayi1 % i == 0 && sayi2 % i == 0) {

				System.out.println(i);
				test = false;
				break;

			}

		}
		if (test) {
			System.out.println(sayi1 + " ve " + sayi2 + " nin ortak tam boleni yok");
		}
scan.close();
	}

}
