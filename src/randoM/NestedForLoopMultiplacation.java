package randoM;

import java.util.Scanner;

public class NestedForLoopMultiplacation {

	public static void main(String[] args) {

				/*	Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
		tablosu olusturun. Ornek,kullanici 3 girerse,
					1 2 3
					2 4 6
					3 6 9		*/
		
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		
		for (int i = 1; i <=sayi; i++) {
			
			for (int j = 1; j <=sayi; j++) {
				
				System.out.print(i*j +"\t");
				
				
			}
			System.out.println("");
		}
		
	/*	for (int satirNo = 1; satirNo <= rakam; satirNo++) {

			for (int i = 1; i <= rakam; i++) {

				System.out.print(satirNo * i + "\t");
			}
		System.out.println("");
		}
		*/
		
		
		
		
		
		
		scan.close();
		
	}

}
