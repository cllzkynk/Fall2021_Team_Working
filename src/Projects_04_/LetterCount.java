package Projects_04_;

 
import java.util.Scanner;

public class LetterCount {

	/*
	 * Given one String Get an each char from String return the count of the each
	 * char
	 * 
	 * For Example
	 * 
	 * String = aabbbcccc
	 * 
	 * return should be a , 2 b , 3 c , 4
	 * 
	 * Note: There could be any char in the String.
	 * 
	 */

	/*
	 * 
	 * Verilen bir String String'den her bir char alin, her bir char'in sayisini
	 * dondur
	 * 
	 * Örnek:
	 * 
	 * String = aabbbcccc
	 * 
	 * return a , 2 olmali b , 3 c , 4
	 * 
	 * Not: Stringde herhangi bir char olabilir.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bisiler");
		String s = scan.nextLine();

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i) + " ===> " + say(s, s.charAt(i)));
		}
		scan.close();
	}

	public static int say(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;

			}
		}

		return count;
	}

}