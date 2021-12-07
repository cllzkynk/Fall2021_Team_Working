package Projects_01_;

import java.util.Scanner;

public class CountDeneme {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen bir cümle giriniz : ");
    String word = scan.nextLine().toLowerCase();
    int counter=0;
    for (int i = 0; i < word.length(); i++) {
        if(word.charAt(i)=='b'){
            counter++;
        }
    }System.out.println(counter);
}}
