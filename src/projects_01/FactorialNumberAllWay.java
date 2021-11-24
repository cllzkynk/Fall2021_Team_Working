package Projects_01;

import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class FactorialNumberAllWay {

	public static void main(String[] args) {

		/* Write a program to find the factorial value of any number entered through the
		 * scanner class.
		 * Example: number:7 factorial:1*2*3*4*5*6*7=5040 output should be == 5040
		 * number:6 factorial:1*2*3*4*5*6=720 output should be == 720
		 */

		/* Scanner class aracýlýðýyla girilen herhangi bir sayýnýn faktöriyel
		 * deðerini bulmak için bir program yazýn. 
		 * number:6 factorial:1*2*3*4*5*6=720 output ---> 720	 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a number for factorial");

		int number = scan.nextInt();
		int factorialFor = 1;
		int factorialWhile = 1;
		int factorialDoWhile = 1;
		int check = 1;
		int numberForDo = number;
		// code start here use int number
		// kodu burdan baslatin ve int number kullanýn
		


		arr(number);

		System.out.println("Wiht method       =" + fak(number));

		for (int i = 1; i <= number; i++) {
			factorialFor *= i;
		}

		System.out.println("With foor loop    =" + factorialFor);

		while (number != 0) {
			factorialWhile *= number;
			number--;
		}

		System.out.println("With While loop   =" + factorialWhile);

		do {
			factorialDoWhile *= check;
			check++;

		} while (check <= numberForDo);

		System.out.println("With DoWhile loop =" + factorialDoWhile);

		scan.close();

	}

	public static void arr(int number) {
		int carpimdepo = 1;

		int arr[] = new int[number];
		for (int i = 1; i <= arr.length; i++) {
			carpimdepo *= i;
			arr[i - 1] = carpimdepo;
		}
	//	System.out.println(Arrays.toString(arr));

		System.out.println("\nWith array metod  =" + Array.getInt(arr, arr.length - 1));
	}

	public static int fak(int number) {
		if (number == 1)
			return 1;
		if (number == 0)
			return 1;
		return number * fak(number - 1);
	}
}
