package Projects_03_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UpdateRange {

	/*
	 * 
	 * Update a method uRange
	 * 
	 * parameters are int array and two ints
	 * 
	 * if the int array has a number between the two int change it to -1
	 * 
	 * for Example int array = 1,6,12,15,22,18,30,16
	 * 
	 * int 1 = 10
	 * 
	 * int 2 = 20
	 * 
	 * result should be 1,6,-1,-1,22,-1,30,-1
	 * 
	 */

	/*
	 * UpdateRange URange isminde bir metod yaziniz, Bu metod parametre olarak int
	 * Array ve 2 adet int almali. Metod kendisine gönderilen Array in içindeki
	 * elemanlardan, yine kendisine gönderilen rakamlar arasinda olanlarina -1
	 * değerini atasin.oluşan yeni diziyi göndersin.main de yazdiriniz.
	 * 
	 * Örnek:
	 * 
	 * int array = 1,6,12,15,22,18,30,16
	 * 
	 * int 1 = 10
	 * 
	 * int 2 = 20
	 * 
	 * sonuc 1,6,-1,-1,22,-1,30,-1 olmali.
	 */
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	 List<Integer> list=new ArrayList<>();
	 
	 System.out.println("Lutfen arraya eklemek isteginiz kadar sayiyi giriniz .\nGirisi bitirmek icin negatif giris yapiniz");
		do {
			list.add(scan.nextInt());
			
		} while (!(list.get(list.size()-1)<0)); 
		list.remove(list.size()-1);
		
		
		Integer []arr=(Integer[]) list.toArray(new Integer[list.size()]);
		System.out.println("Kontrol icin alt sinir gir");
		int alt=scan.nextInt();
		System.out.println("Kontrol icin ust sinir gir");
		int ust=scan.nextInt();
		
		//uRange(arr,alt,ust);
		System.out.println(Arrays.toString(uRange(arr,alt,ust)));
}

	public static Integer[] uRange(Integer[] arr, int alt, int ust) {
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>alt&&arr[i]<ust) {
			arr[i]=-1;
		}
	}
		
return arr ;	}
}
