package randoM;

public class StringReplace {

	public static void main(String[] args) {

		// String olarak girilen icinde harfler ve bosluklar olan telefon numarasini
		// duzgun sekilde yazdiran methodu yaziniz.
		// orn: "abcd 535 855 tel4589 " degerini "535854589" olarak ekrana yazacak.

		duzelt("celil 535tek +- 9935685 ");

	} // main method sonu

	public static void duzelt(String str) {

		System.out.println(str.trim().replaceAll("\\s", "").replaceAll("\\D", ""));

	} // duzelt methodu sonu

} // class sonu
