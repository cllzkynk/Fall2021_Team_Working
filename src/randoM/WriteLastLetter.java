package randoM;

import java.util.Scanner;

public class WriteLastLetter {

	public static void main(String[] args) {


		
		// Kullan�c�dan ismini isteyiniz. �Sminin son harfini yazd�r�n�z.
		
		
				Scanner scan=new Scanner(System.in);
				System.out.print("L�tfen ad�n�z� giriniz:\nAd�n�z:");
				
				String isim=scan.nextLine();
				
						
				System.out.print(isim.substring(isim.length()-1, isim.length())); // son karakteri String olarak aliyor.
		
				
		
		
		
		
		
		scan.close();
		
		
	}

}
