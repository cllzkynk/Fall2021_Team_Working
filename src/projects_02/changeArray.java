package Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiginde

       Eger String Orange iceriyorsa butun  Orange leri Apple  cevir

       ornek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result boyle olmali --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fruit list");
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(", ");

//        Koda burdan başla
//        kullanman gereken -> UseThisArray
           for (int i = 0; i < UseThisArray.length; i++) {
			if (UseThisArray[i].toLowerCase().equals("orange")) {
				UseThisArray[i]="Apple";
			}
		}

        System.out.println(Arrays.toString(UseThisArray));
        
        
        
        
        
        
        
       scan.close(); 
        
}
}