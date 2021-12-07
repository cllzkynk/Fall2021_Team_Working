package Projects_03;

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
   substSquare isminde bir method verildiğinde
   bu method parametre olara iki int alır
   return tipi int olur

   getSumOfSquares methodunu kullanarak


Parameter 1 toplamin karesi+Parameter 1 toplamin karesi= sonuc


   Örnek:

    int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir

    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayı : ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayı : ");
        int num2 = scanner.nextInt();

        int sonuc = substSquare(num1, num2);
        System.out.println(sonuc);
    }
    public static int getSumOfSquares(int n) {

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        return sum * sum;

    }
        public static int  substSquare(int num1 , int num2){

            return getSumOfSquares(num1) + getSumOfSquares(num2);

        }



}
