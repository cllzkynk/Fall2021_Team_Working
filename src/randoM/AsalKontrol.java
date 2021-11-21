package randoM;

import java.util.Scanner;

public class AsalKontrol {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kontrol edilecek pozitif sayiyi giriniz:");
		
		double sayi = scan.nextDouble();
		int sayac=0;
		for (double i = 2; i < sayi; i++) {
			
			if (sayi%i==0) {
				
				sayac++;
				break;
			} 
										
			
		}
		if (sayac>0) {
			System.out.println("ASAL DEGILDIR");
		} else {

			System.out.println("ASALDIR");
		}
		
		
		
		
		
		scan.close();
		
		
	}

}
