package projects_01;

import java.util.Scanner;

public class checkNumberEven {

    /*
        Given an int check the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.

     */


     /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et

        Eğer number çift ise  print true

        Eğer number tek ise  print false

        result true ya da false olmalı.

     */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");

    int num1 = scanner.nextInt();
    
    if (num1%2==0) {
		System.out.println("Even number");
	} else {
		System.out.println("odd number");
	}
    scanner.close();
}
}
