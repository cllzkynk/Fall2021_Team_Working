package randoM;

import java.util.Scanner;

public class IsitPrime {

	public static void main(String[] args) {

//Girilen sayinin asal olup olmadigini yazdiran method yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kontrol etmek istediginiz pozitif tam sayiyi giriniz:");
		double sayi = scan.nextDouble();

		System.out.println(asal(sayi));
scan.close();
	}

	private static boolean asal(double num) {

		boolean kontrol = true;

		if (num > 1) {

			for (int j = 2; j < num; j++) {

				if (num % j == 0) {
					kontrol = false;
					break;
				}

			}

		} else {
			System.out.println("En kucuk asal sayi 2'dir.");
			kontrol = false;
		}

		return kontrol;

	}

}
