package Projects_02;

import java.util.Arrays;

import java.util.Scanner;

public class removeDuplicates {

	/*
	 * Given int array
	 * 
	 * remove the duplicated values from the array
	 * 
	 * print non-duplicated array length
	 * 
	 * for example:
	 * 
	 * Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
	 * 
	 * //1 2 2 2 3 3 3 4 4 4 5 5 5 result should be 5
	 * 
	 * NOTE: while printing the result dont use for loop use
	 * System.out.println(Arrays.toString(your_array_name));
	 */

	/*
	 * Verilen int array
	 * 
	 * 
	 * duplicated(tekrarlanan) ogeleri array den kaldir
	 * 
	 * non-duplicated(tekrarlanmayan) oge sayisini print et
	 * 
	 * Örnek:
	 * 
	 * Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
	 * 
	 * //1 2 2 2 3 3 3 4 4 4 5 5 5
	 * 
	 * result 5 olmali
	 * 
	 * NOT: resultu print ederken for loop kullanmayin
	 * System.out.println(Arrays.toString(your_array_name)); kullanin
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String myStr = scan.nextLine();

		String[] arr = myStr.split(" ");

		int[] useThisArray = new int[arr.length];

		for (int i = 0; i < useThisArray.length; i++) {

			int num = Integer.parseInt(arr[i]);

			useThisArray[i] = num;

		}

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

		// Kodlamaya burdan basla.bu satirdan onceki satirlarda hicbirseyi degistirme.
		// useThisLine arrayini kullan

		System.out.println("Girilenlerle    olusan   array   "+Arrays.toString(useThisArray));

		int i = 0;

		String str = "";
		String check = "";
		for (i = 0; i < useThisArray.length; i++) {
			check = Integer.toString(useThisArray[i]);
			if (!str.contains(check)) {
				str += check + " ";
			}
		}

		//System.out.println(str);

		String myNewArr[] = str.split(" ");

		System.out.println("Tekrarlardan arindirilmis array  "+Arrays.toString(myNewArr));

	
scan.close();
	}
}