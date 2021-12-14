package Projects_04_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitPowers {
	/*
	 * 
	 * Given one method name is power4 Parameter is one int() Return type is an int
	 * 
	 * Get each digit from the parameter int number Take the each number to the
	 * power 4 Sum powered numbers Return the result
	 * 
	 * Example: parameter int is 1234
	 * 
	 * 1â?´ + 2â?´ + 3â?´ + 4â?´ = 1 + 16 + 81 + 256
	 * 
	 * result should be 354
	 * 
	 */

	/*
	 * 
	 * 
	 * Verilen methodun ismi power4 Parametresi int Return tipi de int dir
	 * 
	 * 
	 * Girilen int parametresinin rakamlarÄ±nÄ±n ayrÄ± ayrÄ± 4.kuvvetini alÄ±p
	 * toplayÄ±n
	 * 
	 * Ã–rnek: parameter int is 1234
	 * 
	 * 1â?´ + 2â?´ + 3â?´ + 4â?´ = 1 + 16 + 81 + 256
	 * 
	 * result 354 olmalÄ±
	 * 
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi dizinizi giriniz\nGirisi bitirmek icin tam sayi disinda bir giris yapiniz");
		 
		while (true) {
			if (scan.hasNextInt()) {
				list.add(scan.nextInt());
			} else {
				break;
			}
		}

		System.out
				.println("Girilen dizideki her bir elemanin 4.kuvvetlerinin alinip toplanmis sonucu : " + power4(list));
scan.close();	}

	public static int power4(List<Integer> list) {
		int sum = 0;
		for (Integer i : list) {
			sum += i * i * i * i;
			System.out.println(sum);
		}
		return sum;
	}
}