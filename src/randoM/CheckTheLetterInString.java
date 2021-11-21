package randoM;

import java.util.Scanner;

public class CheckTheLetterInString {

	public static void main(String[] args) {


		//cumledeki farkli harflerin sayisini yazdirin. orn girdi: Java  cikti: J=1  a=2  v=1
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kontrol edilecek kelimeyi giriniz:");
		String kelime = scan.nextLine();
		
		for (int i = 0; i < kelime.length(); i++) {
		
			if (kelime.charAt(i)>='a' && kelime.charAt(i)<='z' || kelime.charAt(i)>='A' && kelime.charAt(i)<='Z') {
				
				
				
				
			}
			
		}
		scan.close();
	}

}
