package randoM;

import java.util.Scanner;

public class FindMyNumber {

	public static void main(String[] args) {


		/*Kullaniciya 0-50 arasinda tuttugumuz sayiyi tahmin etmesini isteyelim,
		 * girdigi sayi kucukse arttir,
		 * girdigi sayi buyukse azalt,
		 * dogru tahmin ederse, kac denemede buldugunu, tebrikler bildiniz, mesajini verelim
		 * 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int sayim= (int) (Math.random()*100);
		int tahmin=0;
		int sayac=0;
		
		do {
			System.out.println("Tuttugum sayiyi tahmin edin.(0-100)");
			
			tahmin=scan.nextInt();
			
			if (tahmin<=100 && tahmin>=0) {
				
				if (tahmin>sayim) {
					
					System.out.println("azalt");
					sayac++;
				} else if(tahmin<sayim) {
					
					System.out.println("arttir.");
					sayac++;

				}else {
					sayim=tahmin;
					sayac++;
				}
				
				
			} else {

				System.out.println("0-100 arasinda deger giriniz!");
			}
			
			
		} while (sayim!=tahmin);
		
		System.out.println("Tebrikler "+sayac+" denemede tuttugum sayiyi buldunuz "+"("+sayim+")");

		scan.close();
	}

}
