package Projects_01_;

import java.util.Scanner;

public class ageDeneme {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen yaşınızı giriniz : ");

    int age = scan.nextInt();

    if (age >= 1 && age <= 10) {
      System.out.println("too young to create a facebook account");
    } else if (age > 10 && age <= 16) {
      System.out.println("too young to get a driver's license");
    } else if (age > 16 && age <= 18) {
      System.out.println("too young to get a tattoo");
    } else if (age > 18 && age <= 21) {
      System.out.println("too young to drink alcohol");
    } else if (age > 21) {
      System.out.println("do what ever you want to do");
    } else {
      System.out.println("Lütfen geçerli bir yaş giriniz");
    }
scan.close();  }
}
