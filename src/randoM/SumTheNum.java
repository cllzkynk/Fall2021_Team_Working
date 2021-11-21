package randoM;

import java.util.Scanner;

public class SumTheNum {

	public static void main(String[] args) {

		/*
		 * Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini
		 * girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
		 * yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok
		 * sayi girdiniz, ben toplayamam” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Kac sayi toplamak istiyorsunuz? : ");

		String cevap = scan.next();

		if (cevap.equalsIgnoreCase("iki") || cevap.equals("2")) {
			
			System.out.print("Lutfen 2 sayi giriniz:\n1.sayi: ");
			int sayi1 = scan.nextInt();
			System.out.print("2.sayi: ");
			int sayi2 = scan.nextInt();
			System.out.println("Toplam: " + (sayi1 + sayi2));
			
		} else if (cevap.equalsIgnoreCase("uc") || cevap.equals("3")) {
			
			System.out.print("Lutfen 3 sayi giriniz:\n1.sayi: ");
			int sayi1 = scan.nextInt();
			System.out.print("2.sayi: ");
			int sayi2 = scan.nextInt();
			System.out.print("3.sayi: ");
			int sayi3 = scan.nextInt();
			System.out.println("Toplam: " + (sayi1 + sayi2 + sayi3));

		} else if (cevap.equalsIgnoreCase("dort") || cevap.equals("4")) {

			System.out.print("Lutfen 4 sayi giriniz:\n1.sayi: ");
			int sayi1 = scan.nextInt();
			System.out.print("2.sayi: ");
			int sayi2 = scan.nextInt();
			System.out.print("3.sayi: ");
			int sayi3 = scan.nextInt();
			System.out.print("4.sayi: ");
			int sayi4 = scan.nextInt();
			System.out.println("Toplam: " + (sayi1 + sayi2 + sayi3+sayi4));

		} else {

			System.out.println("Cok sayi girdiniz ben toplayamam.");
		}
scan.close();
	}

}
