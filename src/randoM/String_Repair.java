package randoM;

public class String_Repair {

	public static void main(String[] args) {


		// soru1	" Java ogrenmek123 Cok guzel@ " stringini "Java ogrenmek cok guzel" seklinde yazdirin.
		
		
		
		String str1 = " Java ogrenmek123 Cok guzel@ ";
		
	
//				___1____   ______2_____________    ___3___________     _______4_________     ____5________    ______6________
		str1 = str1.trim().replaceAll("\\d", "").replace(" " , "x").replaceAll("\\W", "").replace("x", " ").replace("C", "c");
		
		
		
		// 1	once cumlenin basindaki ve sonundaki bosluklardan trim() kullanarak kurtulduk. 
		// 2	replaceAll("\\d", "") ile cumle icindeki rakamlari hiclik ile degistirdik.
		// 3	replace(" " , "x") ile cumle icindeki bosluklari x karakteri ile degistirdik.
		// 4	replaceAll("\\W", "") ile cumlede word olmayan karakterden yani @ isaretinden kurtulduk.
		// 5	replace("x", " ") ile x ile bosluk karakterini degistirip eski haline cevirdik.
		// 6	en son olarak replace("C", "c") ile buyuk C harfini kucuk C ile degistirdik.
				
				
		System.out.println(str1); //Java ogrenmek cok guzel


		
		
	
	}

}
