package Projects_01_;

import java.util.Scanner;

public class FactorialNumberDeneme {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen Faktoriyel alınması için bir sayı giriniz : ");
    int number = scan.nextInt();
    int factor = 1;
    for (int i = 1; i <=number; i++) {
      factor *= i;
    }
    System.out.println(factor);
  }
}
