package Projects_01_;

import java.util.Random;
import java.util.Scanner;

public class RandomNumDeneme {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen bir tamsayı girin : ");
    int max = scan.nextInt();

    for (int i = 0; i < 1; i++) {
      Random rnd = new Random();

      System.out.println(rnd.nextInt(max));
    }
  }
}
