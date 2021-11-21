package randoM;

import java.util.Scanner;

public class AsalSayiBulmaForLoop {

	public static void main(String[] args) {


		Scanner scan =new Scanner (System.in);
		
		System.out.println("Kontrol etmek istediginiz sayiyi giriniz: ");
		
		int sayi =scan.nextInt();
		
		
		asalMi(sayi);
				
		
		
		scan.close();
		
	}//main sonu

	public static void asalMi(int asal) {
		int i =2;
		boolean flag=false;
		if (asal>2) {
			
			for ( i = 2; i <= asal/2; i++) {
				if (asal%i==0) {
				flag =true;
				break;
				}
			
			}
		
		} else if(asal==2) {
			System.out.println(asal +" ASAL SAYIDIR");
		}else {
			System.out.println("1 den buyuk sayilar asal sayi olabilir.");
		}
		
		if (flag) {
			System.out.println(asal+"  asal sayi degildir "+ i +" sayisina tam bolunuyor");
		}else {
			System.out.println(asal +" ASAL SAYIDIR");
		}
			
	}
	
	
	
	
	
	
}//class sonu
