package randoM;

import java.util.Scanner;

public class IsItTriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

				System.out.print("1.kenar: ");

		double kenar1 = scan.nextDouble();
		
				System.out.print("2.kenar: ");

		double kenar2 = scan.nextDouble();
		
				System.out.print("3.kenar: ");
		
		double kenar3 = scan.nextDouble();
		
		
		
		
		ucgenmi(kenar1, kenar2,kenar3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
scan.close();
	} // main method sonu

	public static void ucgenmi(double a, double b, double c) {

		if (a + b > c && a + c > b && b + c > a && a - b < c && a - c < b && b - c < a) {

			System.out.println("Girilen degerlerle ucgen olusabilir.");

		} else {

			System.out.println("girilen degerlerle ucgen olusamaz.");
		}

	}

} // class sonu
