package randoM;

import java.util.Scanner;

public class SomOfDigits {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m�: addDigits isminde bir method olu�turun. Parametresi int
		 * Return tipi de int Pozitif int de�erler ver ve en son sonu� tek basamakl�
		 * ��kana kadar basamaklar� birbiriyle topla. Tek basamakl� ��kt���nda, d�nd�r�n
		 * 
		 * �rnek1: Girdi 38 ��kt�: 2 A��klama: ��lemler ��yle olacak: 3 + 8 = 11, 1 + 1
		 * = 2. 2 , tek basamakl� oldu�undan, bunu d�nd�r�n.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Rakam degerleri toplanacak sayiyi giriniz:");

		int sayi = scan.nextInt();

		int toplam = 0;
		int rakam = 0;

		while (sayi > 0) {

			rakam = sayi % 10;
			toplam += rakam;
			sayi /= 10;
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami: " + toplam); // 11 //1+2=3

		int tpl = 0;
		while (toplam >= 10) {

			tpl += toplam % 10;
			toplam /= 10;
			tpl += toplam % 10;
			System.out.println("Rakamlar toplaminin rakamlar toplami: " + tpl);
		}

		while (tpl >= 10) {

			tpl = tpl % 10 + tpl / 10;
			System.out.println("Rakamlar toplaminin rakamlar toplaminin rakamlari toplami: " + tpl);
		}
		scan.close();
	}
}