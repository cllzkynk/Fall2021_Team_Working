package Projects_01_;

import java.util.Scanner;

public class PrintEvenNumbersDeneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen bir tamsayı girin : ");
    int number = scan.nextInt();
    for (int i = 0; i <=number; i++) {
        if(i%2==0)System.out.print(i+" ,");
    }
        
    scan.close(); }
}
