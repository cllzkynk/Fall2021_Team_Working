package randoM;

import java.util.Scanner;

public class DoForLoopSorular {

	public static void main(String[] args) {


		/*	Soru 1 ) 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
			Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.
			Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini 
			soyleyin. 
			Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin 
			toplaminin kac oldugunu yazdirin. 
			Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini 
			soyleyin. 
			Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi 
			giremezsiniz” yazdirip basa donun
			Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi 
			girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin. 
*/
		System.out.println("");
		System.out.println("*******************************************************************\n1.soru cozumu:");
		//Soru 1 ) 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
		int bas = 9;
		
		do {
			if (bas%7==0) {
				System.out.print(bas+" ");

			}
			bas++;
			
		} while (bas<=190);
		
		//********************************************************************************//
		
		
		//Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

		System.out.println("");
		System.out.println("*******************************************************************\n2.soru cozumu:");
		
		char harf='m';
		
		do {
			
			System.out.print(harf+" ");
			harf--;
		} while (harf>='c');
		
		
		
		//********************************************************************************//
		
		
		
		/*Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini 
		soyleyin. 
		Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin 
		toplaminin kac oldugunu yazdirin. */
		
		System.out.println("");
		System.out.println("*******************************************************************\n3.soru cozumu:");
		Scanner scan = new Scanner(System.in);
		
		int sayi =0;
		int toplam =0;
		int sayac =0;
		do {
			System.out.println("Toplanacak sayilari giriniz, bitirmek icin 0 a basiniz!");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		} while (sayi!=0);
		
		
		System.out.println("Girilen "+(sayac-1)+" tane sayinin toplami: "+toplam);
		
		
		//********************************************************************************//
		
		
		
		/*Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini 
			soyleyin. 
			Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi 
			giremezsiniz” yazdirip basa donun
			Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi 
			girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin. */
		
		System.out.println("");
		System.out.println("*******************************************************************\n4.soru cozumu:");
		
		int tpl =0;
		int syc=0;
		int syi=1;
		
		do {
			System.out.println("Toplamak icin pozitif sayilar giriniz, islemi bitirmek icin 0'a basimiz.");
			syi=scan.nextInt();
			
			if (syi>0) {
				tpl+=syi;
				syc++;
			} else if (syi<0) {
				System.out.println("Negatif sayi giremezsiniz!");
			}
		
		} while (syi!=0);
		
		System.out.println("Girilen "+(syc)+" tane sayinin toplami: "+tpl);
		
		
		
		
		
		scan.close();
		
		
	}

}
