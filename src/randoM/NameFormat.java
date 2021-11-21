package randoM;

import java.util.Scanner;

public class NameFormat {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.print("Adinizi soyadinizi giriniz: ");
		
		String isim = scan.next().toUpperCase();
		
		String isim2 = scan.next().toUpperCase();

		String isim3 = scan.next().toUpperCase();

		System.out.println(""+ isim.charAt(0)+"."+isim2.charAt(0)+"."+isim3.charAt(0));
		
		
		
		
		
		
		scan.close();
	}

	
}
