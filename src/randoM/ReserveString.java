package randoM;

import java.util.Scanner;

public class ReserveString {

	public static void main(String[] args) {

		// kullanicinin girdigi cumleyi tersten yazdiriniz.orn: java calisiyorum
		// cikti:muroyisilac avaJ (for,substring)

		Scanner scan = new Scanner(System.in);
		System.out.println("Ters yazdirilacak cumleyi giriniz:");
		String cumle = scan.nextLine();
		String ters = "";

		for (int i = cumle.length() - 1; i >= 0; i--) {

			ters += cumle.charAt(i);

		}

		System.out.println(ters);

		scan.close();

	}

}
