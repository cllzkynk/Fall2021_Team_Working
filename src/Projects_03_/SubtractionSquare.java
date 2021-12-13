package Projects_03_;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /*
   substSquare isminde bir method verildiginde
   bu method parametre olara iki int alir
   return tipi int olur

   getSumOfSquares methodunu kullanarak


Parameter 1 toplamin karesi+Parameter 1 toplamin karesi= sonuc


  Onek:

    int 1 = 10;              yazacaginiz method 10 u kullanarak 3250 sonucu verir

    int 2 = 5;                yazacaginiz method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250
    */
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Ilk sayiyi giriniz");
	  int n1=scan.nextInt();
	  System.out.println("Ikinci sayiyi giriniz");
	  int n2=scan.nextInt();
	  
	 // substSquare(sum(n1),sum(n2));
	  
	  System.out.println(substSquare(sum(n1),sum(n2)));
	scan.close();  
}
public static int sum(int n) {
	if(n<1) return 0;
return n+sum(n-1);
}
	public static int substSquare(int n1, int n2) {
		
	return n1*n1+n2*n2;
	}
}


