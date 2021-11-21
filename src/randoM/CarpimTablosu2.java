package randoM;

import java.util.Scanner;

public class CarpimTablosu2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Carpim tablosu icin rakam giriniz:");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {

			for (int j = 1; j <= sayi; j++) {
				System.out.print("\t" + i * j);
			}
			System.out.println("");
		}

		scan.close();

	}

}
