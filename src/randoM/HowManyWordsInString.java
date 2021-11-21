package randoM;

import java.util.Scanner;

public class HowManyWordsInString {

	public static void main(String[] args) {
		//-kullanicinin girdigi cumlenin kac kelimeden olustugunu yazdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cumle giriniz:");
		
		String cumle = scan.nextLine();
		
		int sayac=0;
		
		for (int i = 0; i < cumle.length(); i++) {
				
				if (cumle.substring(i, i+1).equals(" ")) {
					
					sayac++;

			}
			
		}
		System.out.println("Girilen cumlede: "+(sayac+1) + " tane kelime var.");
		
		
		
	scan.close();	
	}

}
