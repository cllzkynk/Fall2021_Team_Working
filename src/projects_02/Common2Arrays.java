package Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class Common2Arrays {

    /*
         Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true

     */

    /*

        a ve b den olusan 2 int array verildiginde, ayni ilk ogeye sahiplerse veya ayni son ogeye sahiplerse true degerini dondurun.

        Her iki arrayin lengthi(oge sayisi) 1 veya daha fazla olacaktir.

       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }
        int[] array1 = new int[3];
        int[] array2 = new int[2];
        for(int i = 0 ; i <3 ; i++){
            array1[i] = myArr[i];
        }
        for(int i = 3 ; i <5 ; i++){
            array2[i-3] = myArr[i];
        }

/*
        your code start here .
        Use array 1 and array 2 .
        Don't change or delete anything before this line


        // Bu satirdan onceki satirlarda hicbirseyi silme ve degistirme
        // koda burdan basla
        // array1 and array2  kullan



 */
        

System.out.println(Arrays.toString(array1));
System.out.println(Arrays.toString(array2));

boolean flag=false;
for (int i = 0; i < array2.length; i++) {
	for (int j = 0; j < array1.length; j++) {
		if (array2[i]==array1[j] ) {
			flag=true;
		
			break;
		}
	}
}

if (flag) {
	System.out.println("Girilen degerlerin olusturdugu  iki farkli arrayda ortak eleman mevcut");
}else {
	System.out.println("Girilen degerlerin olusturdugu  iki farkli arrayda ortak eleman yok");
}


scan.close();
    }

}
