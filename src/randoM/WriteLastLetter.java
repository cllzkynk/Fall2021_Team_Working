package randoM;

import java.util.Scanner;

public class WriteLastLetter {

	public static void main(String[] args) {


		
		// Kullanýcýdan ismini isteyiniz. ÝSminin son harfini yazdýrýnýz.
		
		
				Scanner scan=new Scanner(System.in);
				System.out.print("Lütfen adýnýzý giriniz:\nAdýnýz:");
				
				String isim=scan.nextLine();
				
						
				System.out.print(isim.substring(isim.length()-1, isim.length())); // son karakteri String olarak aliyor.
		
				
		
		
		
		
		
		scan.close();
		
		
	}

}
