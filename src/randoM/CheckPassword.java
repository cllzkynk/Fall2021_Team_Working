package randoM;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {


		/*		Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
						basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
						sifre girin” yazdirin
							- Ilk harf buyuk harf olmali
							- Son harf kucuk harf olmali
							- Sifre bosluk icermemeli
							- Sifre uzunlugu en az 8 karakter olmali  		*/
		
		
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir sifre giriniz:");
		
		String sifre = scan.next();
		
	//      ilk harf (index=0) A-Z arasinda olsun       //          son harf (index=(lenght()-1) a-z arasinda olsun             //     sifrede bosluk olmasin //  uzunlugu en az 8 olsun	
		if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z' && sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z' && !sifre.contains(" ") && sifre.length()>=8) {  
			
			
			System.out.println("Sifre basari ile tanimlandi.");
			
			String yeniSifre = sifre;
			System.out.println("Yeni sifreniz: "+yeniSifre.substring(0, 1)+yeniSifre.substring(1, yeniSifre.length()-1).replaceAll("\\S", "*")+yeniSifre.substring(yeniSifre.length()-1, yeniSifre.length()));
		} else {

			System.out.println("\nIslem basarisiz, lutfen asagidaki kriterlere gore \nyeni bir sifre girin.\n\n*************\nilk harf buyuk\nson harf kucuk\nsifre bosluk icermemeli\nve en az 8 karakter icermelidir.\n*************");
		}
		
		
		
	scan.close();
		
		
	}

}
