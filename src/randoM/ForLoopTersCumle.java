package randoM;

import java.util.Scanner;

public class ForLoopTersCumle {

	public static void main(String[] args) {


		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen kelime veya cumle giriniz:");
		String cumle=scan.nextLine();
		
		
		int kelimeSayac=1;
		
		String tersCumle = "";
		
		for (int i = 0; i <=cumle.length()-1; i++) {
			
			if (cumle.charAt(i)==' ') {
				kelimeSayac++;					// kelime sayisini hesapladi.
			}
			
		}
		
						
		for (int i = 1; i <=kelimeSayac; i++) {   // kelime sayisinca islem tekrarlandi.
			
			if (cumle.contains(" ")) {
				
				int sonBosluk = cumle.lastIndexOf(" "); // cumledeki son bosluk karakterinin indexi
				tersCumle+=cumle.substring(sonBosluk+1)+" "; // son bosluktan sonraki kismi yani son kelimeyi ters variable icine sonuna bosluk koyarak ekledik.
				cumle=cumle.substring(0,sonBosluk); // yeni kelimemizi son kelime olmadan yeniledik.
			}else {
				tersCumle+=cumle.substring(0); // tek kelime kalinca burasi calisacak
			}
			
		}
		
		System.out.println(tersCumle);

		
	
		
		
		scan.close();
		
		
	}

}
