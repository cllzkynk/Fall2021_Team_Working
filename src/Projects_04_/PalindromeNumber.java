package Projects_04_;

import java.util.Scanner;

public class PalindromeNumber {

      /*
        Given a method name is returnNum
        Parameter is one int
        Return type is int

        Reverse the parameter int and return it

        Example:
        int  = 1234

        return should be 4321
     */

   

    /*
        Given palindromeNum method
        Parameter is one int (num1)
        Return type is one int

        Palindrome means a word or number reads the same backward as forward like "mom" , "refer" , "131" , "1221"

       Add num1 and reverse of num1, find the result.
       Check if the result is a palindrome or not.
       If the result is not a palindrome number, find the reverse of the result.
       And add the result and reverse of the result, find the new total.
       Check if the new total is a palindrome or not.
       Do the same steps until you reach a palindrome number in your result.
       After you reached the palindrome number, find the count that how many times you did the same operation to reach a palindrome number.
       Return the count

        Example:
            num1 = 349  --> 349  + 943 =1292     Note : since 1292 is not palindrome do the same step for this  // first operation
                            1292 + 2921 = 4213   Note : 4213 is not palindrome  do the same step for this // second opeartion
                            4213 + 3124 = 7337   Note : 7337 is palindrome      // third operation  you reached the palindrome so count is 3

        return should be 3
        HINT: You better use while loop for this question

     */


     /*
        Verilen method palindromeNum
        Parametresi bir tane int (num1)
        Return tipi int

        Palindrome, bir kelime veya sayının, tıpkı ileri ile aynı şekilde geriye doğru okuduğu anlamına gelir
        Örneğin --   "mom" , "refer" , "131" , "1221"


       num1'i ve num1'in tersini ekleyin, sonucu bulun.
       Sonucun palindrom olup olmadığını kontrol edin.
       Sonuç bir palindrom numarası değilse, sonucun tersini bulun.
       Ve sonucu ve sonucun tersini ekleyin, yeni toplamı bulun.
       Yeni toplamın bir palindrom olup olmadığını kontrol edin.
       Sonuçlarınızda bir palindrom numarasına ulaşana kadar aynı adımları uygulayın.
       Palindrom numarasına ulaştıktan sonra, bir palindrome numarasına ulaşmak için aynı işlemi kaç kez yaptığınızı bulun.
       Return  count olmali

        Örnek:
            num1 = 349  --> 349  + 943 =1292     Not : 1292 palindrom olmadığından bunun için aynı adımı uygulayın  // birinci işlem
                            1292 + 2921 = 4213   Not : 4213 palindrom değil bunun için aynı adımı yapın // ikinci işlem
                            4213 + 3124 = 7337   Not : 7337  palindrome      // üçüncü işlemde palindroma ulaştınız ve count 3 olur

        return  3 olmalı
        İPUCU:  Bu soru için while loop kullansanız iyi olur

     */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bi tamsayi 2,3,4,... basamakli falan olsun");
		int num=scan.nextInt();
		int Pol=num+tersCevir(num);
		System.out.println("Girilen sayinin kendisi "
				+ "ile tersinin toplami "+ (isPlondrome(Pol)?"Polindromdur":"Polindrom degildir") );
		scan.close();
	}

	public static boolean isPlondrome(int pol) {
		StringBuilder sb=new StringBuilder(String.valueOf(pol));
		if(pol==Integer.parseInt(sb.reverse().toString())) return true ;
		
return false ;	}

	public static int tersCevir(int num) {
		StringBuilder sb=new StringBuilder(String.valueOf(num));
int	num1=Integer.parseInt(sb.reverse().toString());
		
	return num1 ;}
}
