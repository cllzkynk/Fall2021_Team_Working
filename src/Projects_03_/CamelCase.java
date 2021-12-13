package Projects_03_;

 
import java.util.Arrays;
import java.util.Scanner;

public class CamelCase {

	/* First letter to upper case parameter is one String return type is String
	 * words are delimited by a space. All the words first letter should be camel
	 * case
	 * input:
	 * I lIVe in uSa
	 * Result should be
	 * I Live In Usa
	 */

	/* Soru 1: CamelCase : camelcase adinda Kendisine gonderilen bir cumledeki
	 * kelimelerin ilk karakterlerini buyuk harfe cevirip geri donduren metodun
	 * yaziniz. input:
	 * I lIVe in uSa
	 * Result should be
	 * I Live In Usa
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String Giriniz");

		String arr[] = scan.nextLine().split(" ");
		System.out.println(Arrays.toString(camelCase(arr)));
		
		
		scan.close();

	}

	
	
	private static String[] camelCase(String[] arr2) {
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr2[i].substring(0, 1).toUpperCase() + arr2[i].substring(1).toLowerCase();
		}

		return arr2;
	}

	
	
	
}
