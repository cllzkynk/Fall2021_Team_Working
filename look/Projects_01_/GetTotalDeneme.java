package Projects_01_;

import java.util.Scanner;

public class GetTotalDeneme {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen başına '$' işareti koyarak 3 adet para girin : ");
    String allElements = scan.nextLine();
    String[] elements = allElements.split(" ");
    String num1 = elements[0];
    String num2 = elements[1];
    String num3 = elements[2];

    int i1 = Integer.parseInt(num1.replaceAll("[$A-Za-z]", ""));
    int i2 = Integer.parseInt(num2.replaceAll("[$A-Za-z]", ""));
    int i3 = Integer.parseInt(num3.replaceAll("[$A-Za-z]", ""));
    int total = i1 + i2 + i3;
    if (total < 0) System.out.println("-1"); else System.out.println(total);
    scan.close(); }
}
