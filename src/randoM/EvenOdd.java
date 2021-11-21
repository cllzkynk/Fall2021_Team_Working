package randoM;

import java.util.Scanner;

public class EvenOdd {

		@SuppressWarnings("unused")
		public static void main(String[] args) {

		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. 
		 * Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, 
		 * ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini,
		 * 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		
		
			
			
			
			
			
			scan.close();
			
			
			

			
			
		
	} //main method sonu

	
		
		
		public static void tekCift(int a) {
			
			if (a%2==0) {
				System.out.println("Sayi cifttir.");
			} else {

				System.out.println("Sayi tek sayidir.");
			}
						
		}
		
		
		public static void pozitif(int a) {
			
			if (a>0) {
				System.out.println("Sayi sifirdan buyuktur.");
			} else {

				System.out.println("Sayi sifirdan kucuktur.");
			}
		}
		
		
		public static void yuzdenBuyuk(int a) {		//  //       2569/10=256%10   //   5125
			
			if (a>100) {
				
				System.out.println("Sayinin yuzler, onlar ve birler basamagindaki rakamlar toplami: " +a%10+(a/10)%10+(a/100) );
				
			} else {

				System.out.println("Sayinin birler basamagindaki rakam: "+ a%10 );
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
	
} //class sonu
