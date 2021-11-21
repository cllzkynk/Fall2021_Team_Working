package randoM;

import java.util.Scanner;

public class RepeatedLetter {

	public static void main(String[] args) {

		// Bir String icerisinde yinelenen karakterleri döndüren bir kod yazýniz.
		// Input :
		// String str=“Javaisalsoeasy”
		// Output: a s

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz:"); /// hahah----------> a h
		String str = scan.next();
		String depo = "";

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {

					if (!depo.contains(str.substring(j, j + 1))) {

						depo += str.charAt(j);
					}
				}
			}

		}

		System.out.println(depo);

		scan.close();

	}

}
