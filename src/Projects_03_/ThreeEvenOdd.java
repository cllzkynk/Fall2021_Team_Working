package Projects_03_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre olarak int dizisi verildiginde
   array 3 tane cift veya 3 tane  tek deger iceriyorsa true degerini dondurur


   Ornek:

   intArray([2, 1, 3, 5]) sonuc  true olmali
   intArray([2, 1, 2, 5]) sonuc   false olmali
   intArray([2, 4, 2, 5]) sonuc   true olmali

    */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	 List<Integer> list=new ArrayList<>();
	 
	 System.out.println("Lutfen arraya eklemek isteginiz kadar sayiyi giriniz .\nGirisi bitirmek icin negatif giris yapiniz");
		do {
			list.add(scan.nextInt());
			
		} while ((list.get(list.size()-1)<0)); 
		list.remove(list.size()-1);
		
		
		Integer []arr=(Integer[]) list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(arr));
		
	
		System.out.println(check(arr));
	scan.close(); 
}

	public static boolean check(Integer[] arr) {
	int even=0;
	int odd=0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==0) {
			even++;
		}else {
			odd++;
		}
	}
		
if (even==3 ||odd==3) {
	return true;
}
	
return false;	}
	
	
	
	
	
	}   