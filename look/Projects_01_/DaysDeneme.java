package Projects_01_;

import java.util.Scanner;

public class DaysDeneme {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen bir sayı giriniz : ");
    int days = scan.nextInt();

    switch (days) {
      case 1:
        System.out.println("Pazartesi");
        break;
      case 2:
        System.out.println("Salı");
        break;
      case 3:
        System.out.println("Çarşamba");
        break;
      case 4:
        System.out.println("Perşembe");
        break;
      case 5:
        System.out.println("Cuma");
        break;
      case 6:
        System.out.println("Cumartesi");
        break;
      case 7:
        System.out.println("Pazar");
        break;
      default:
        System.out.println("Lütfen geçerli bir numara giriniz");
        break;
    }
    scan.close(); }
}
