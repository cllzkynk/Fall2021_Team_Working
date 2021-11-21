package randoM;

public class StringDoubleConvert {

	public static void main(String[] args) {


		// soru2	String str1 = "$13.99"	ve  String str2 = "$10.55"	seklinde verilen fiyatlarin toplamini bulunuz.

		
		
		String str1 = "$13.99";
		
		String str2 = "$10.55";
		
		
		
		str1 = str1.replace("$", "");		//	$ isaretini hiclik ile degistirdik.  13.99      
		
		str2 = str2.replace("$", "");		//	$ isaretini hiclik ile degistirdik.  10.55
		
		
		double toplam = Double.valueOf(str1)+ Double.valueOf(str2) ; //Double.valueOf wrapper classi ile String virgullu ifadeleri double data turune cevirip toplayip atadik.
		
		System.out.println(toplam);
		
		
		System.out.println(str1);
		System.out.println(str2);
		
		
	}

}
