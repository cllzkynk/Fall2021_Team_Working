package Projects_01;

import java.util.Scanner;

public class twoString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Given two string by using scanner class and add each other if first word last
		 * letter is same with second word first letter then remove one of them.
		 * 
		 * Example: "abc", "catalog" --> "abcat" "abc", "dog" -->"abcdog"
		 */

		/*
		 * Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .
		 * 
		 * Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı
		 * olan harflerin birisini kaldırın
		 * 
		 * Ornek: "abc", "cat" --> "abcat" "abc", "dog" -->"abcdog"
		 * 
		 * 
		 */
		Scanner dp = new Scanner(System.in);

		String allElements = dp.nextLine();

		String[] elements = allElements.split(" "); // ali can===> [Ali , Can]

		String s1 = elements[0];

		String s2 = elements[1];
		String sonuc="";

		// code start here use s1 and s2 as words
		// kodu burdan başlatın ve s1 ve s2 kelime olarak kullanın

		if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
			sonuc=s1 + s2.substring(1);
			
			
			//System.out.println(s1 + s2.substring(1));
		} else {
			
			sonuc=s1 + s2.substring(0);
			
			//System.out.println(s1 + s2.substring(0));
		}
		dp.close();
	}
}
