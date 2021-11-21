package randoM;

import java.util.Scanner;

public class BiggestorSmall {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
		 * olanlarini konsola yazdiriniz int num1 int num2 int num3
		 */

		// sayi1>sayi2>sayi3
		// sayi1>sayi3>sayi2

		// sayi2>sayi1>sayi3
		// sayi2>sayi3>sayi1

		// sayi3>sayi1>sayi2
		// sayi3>sayi2>sayi1

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen siralama yapmak istediginiz 3 sayiyi giriniz:");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		if (sayi1 > sayi2 && sayi1 > sayi3) {

			if (sayi2 > sayi3) {
				System.out.println("en buyuk sayi: " + sayi1 + " \nen kucuk sayi: " + sayi3);
			} else {

				System.out.println("en buyuk sayi: " + sayi1 + " \nen kucuk sayi: " + sayi2);

			}

		} else if (sayi2 > sayi1 && sayi2 > sayi3) {

			if (sayi1 > sayi3) {
				System.out.println("en buyuk sayi: " + sayi2 + " \nen kucuk sayi: " + sayi3);

			} else {

				System.out.println("en buyuk sayi: " + sayi2 + " \nen kucuk sayi: " + sayi1);

			}

		} else if (sayi3 > sayi1 && sayi3 > sayi2) {

			if (sayi1 > sayi2) {
				System.out.println("en buyuk sayi: " + sayi3 + " \nen kucuk sayi: " + sayi2);

			} else {

				System.out.println("en buyuk sayi: " + sayi3 + " \nen kucuk sayi: " + sayi1);

			}

		}
		scan.close();
	}

}
