package randoM;

import java.util.Scanner;

public class FormatOfName {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri
		// ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
		// kalan harfler * olacak sekilde birlestirsin
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde
		// kullanin

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lutfen ismini giriniz: ");
		
		String isim = scan.nextLine();
		
		System.out.print("Lutfen soyisminizi giriniz: ");
		
		String soyIsim = scan.nextLine();
		
		System.out.println("isminizi acik yazdirmak icin A'ya\nisminizi gizli yazdirmak icin G'ye basiniz.");
		
		char cevap = scan.next().toUpperCase().charAt(0);
		
		if (cevap=='A') {
			
			isimDuzelt(isim,soyIsim);
			
		} else if (cevap=='G') {

			isimGizle(isim,soyIsim);
			
		} else {
			System.out.println("Lutfen A veya G den birini seciniz!");
		}
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
	} // main method sonu

	
	public static void isimDuzelt(String str1 , String str2) {
		
		
		System.out.println(str1.toUpperCase().charAt(0)+str1.toLowerCase().substring(1)+" "+str2.toUpperCase().charAt(0)+str2.substring(1).toLowerCase());
		
		
	}
	
	
	public static void isimGizle(String str3, String str4) {
		
		
		System.out.println(str3.toUpperCase().charAt(0)+str3.substring(1).replaceAll("\\S", "*").replaceAll("\\s", "*")+" "+str4.toUpperCase().charAt(0)+str4.substring(1).replaceAll("\\S", "*").replaceAll("\\s", "*"));
		
	}
	
	
	
	
	
	
	
} //class sonu
