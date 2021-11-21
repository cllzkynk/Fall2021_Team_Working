package randoM;

import java.util.Scanner;

public class CheckTheMail {

	public static void main(String[] args) {


		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Lutfen mail adresinizi giriniz :");
		
		String mail = scan.next();
		
		
		if (!mail.contains("@")) {
			
			System.out.println("Gecersiz mail girdiniz.");
			
			
		} else if (!mail.contains("gmail.com")) {
			
			System.out.println("Lutfen gmail adresinizi giriniz.");

		} else if (!mail.endsWith("@gmail.com")) {
			
			System.out.println("Yazimda sorun var lutfen maili kontrol ediniz.");
		}else {
			
			System.out.println("mail kaydedildi");
		}
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
	}

}
