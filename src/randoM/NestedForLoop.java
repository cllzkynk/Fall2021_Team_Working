package randoM;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {

		/*
		Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve 
		girilen rakama gore asagidaki sekli cizdirin
		*
		* *
		* * *
		* * * * 

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam = scan.nextInt();
		
		// mesela kullanici 5 girmis olsun
		
		
		for (int i = 1; i <=rakam; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	for (int satirNo = 1; satirNo <=rakam; satirNo++) {
			
			for (int i = 1; i <=satirNo ; i++) {
				System.out.print("* ");
				
			}
			
			System.out.println(""); 
		}*/
		
		scan.close();

	}

}
