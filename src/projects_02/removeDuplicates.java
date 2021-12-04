package Projects_02;

import java.util.ArrayList;

import java.util.List;
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
	 * Array is
	 * 
	 * 1,2,2,2,3,3,3,4,4,4,5,5,5
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
		System.out.println("gir bisiler");
		String myStr = scan.nextLine();

		String[] arr = myStr.split(" "); // "1","2", ===> 1,2

		int[] useThisArray = new int[arr.length];

		for (int i = 0; i < useThisArray.length; i++) {

			int num = Integer.parseInt(arr[i]);
			// Integer.parseInt(//String) ==>String sayi metematiksel sayiya donusur "1"==>
			// 1

			useThisArray[i] = num;

		}
		System.out.println(uniqCount(useThisArray)  + " Result = "+ uniqCount(useThisArray).size());
	}

	// 1 2 2 3 1 3 4 4 7 5
	public static List<Integer> uniqCount(int[] useThisArray) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < useThisArray.length; i++) {
			for (int j = i + 1; j < useThisArray.length; j++) {
				if (!list.contains(useThisArray[i])) {
					list.add(useThisArray[i]);
				}
			}
		}

		return list;
	}
}