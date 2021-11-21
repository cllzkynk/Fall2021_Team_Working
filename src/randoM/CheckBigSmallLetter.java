package randoM;

import java.util.Scanner;

public class CheckBigSmallLetter {

	public static void main(String[] args) {

		//kullanicinin girdigi cumledeki BUYUK harfleri kucuk, kucuk harfleri BUYUK sekilde yeniden yazdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz:");

		String cumle = scan.nextLine();
		String yeniCumle=cumle;
		
		for (int i = 0; i < cumle.length(); i++) {  
			
			if (cumle.charAt(i) >='a' && cumle.charAt(i)<='z' ) {
				
				yeniCumle = yeniCumle.substring(0,i)+cumle.substring(i, i+1).toUpperCase()+yeniCumle.substring(i+1);

				
			}else if (cumle.charAt(i) >='A' && cumle.charAt(i)<='Z') {
				
				yeniCumle = yeniCumle.substring(0,i)+cumle.substring(i, i+1).toLowerCase()+yeniCumle.substring(i+1);

			}
			
		}						
		
		System.out.println(yeniCumle);
		
		
		scan.close();
	}

}
