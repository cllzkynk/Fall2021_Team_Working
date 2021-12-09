package Projects_01_;

import java.util.Scanner;

public class PerfectSquareDeneme {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen bir tamsayı girin : ");
    int number = scan.nextInt();
    int temp = 0;
    for (int i = 0; i < number / 2 + 1; i++) {
      if (number == i * i) temp = 1;
    }
    if (temp == 1) System.out.println("True"); 
    else System.out.println("False");
    scan.close();  }
}
