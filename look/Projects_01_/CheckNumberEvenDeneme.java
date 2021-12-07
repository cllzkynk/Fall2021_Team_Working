package Projects_01_;

import java.util.Scanner;

public class CheckNumberEvenDeneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
    
        int number = scan.nextInt();

        if(number%2==0){
            System.out.println("Çift bir sayı girdiniz");
        }else
        System.out.println("Tek bir sayı girdiniz.");
    }
}
