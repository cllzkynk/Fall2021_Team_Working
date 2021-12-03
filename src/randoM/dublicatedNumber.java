package randoM;



import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class dublicatedNumber {				// kullanýcýdan liste uzunluðunu ve lementleri alýp
							// listede double olanlarý ve 2 den fazla kullanýlanlarý bulup listeler
	static List<Integer> userList = new ArrayList<Integer>();
	static int flag=0 ;
	static int num =0;
	static List<Integer> doubleList = new ArrayList<Integer>();
	static List<Integer> multipleList = new ArrayList<Integer>();
	static boolean control=false ;
	
	
	public static void main(String[] args) {				// kullanýcýdan listenin uzunluðunu ve elementlerini alan blok
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int length= scan.nextInt();
		
	
		System.out.println("Enter the elements");
		
		for(int i=0 ; i<length ; i++) {
			userList.add(scan.nextInt());
		}
		System.out.println(userList);						// kullanýcýdan listenin uzunluðunu ve elementlerini alan blok
		

		
		while(num<length) {									// while bloðu önce dublicate methoduna yollar oradan bir sayýnýn 
			dublicate(userList.get(num),length);			// kaç kez tekrar ettiðini tespit edip flag a yükleyip döner
			if(flag==2) {
				control=true;
				addDouble(userList.get(num));
				if(control == true) {
					doubleList.add(userList.get(num));
				} 
			

			} else if (flag>2) {
				control=true;
				addMultiple(userList.get(num));
				if(control == true) {
					multipleList.add(userList.get(num));
				}
				
			} 
			
			num++;
		}													//	while bloðu												
		
		System.out.println("Double number in your list  : " + doubleList);
		System.out.println("Number used more than two  : " + multipleList);
	scan.close();}															// main metot sonu
	
	public static int dublicate(int num2,int length2) {		// dublicate bloðu
		
		flag=0;
		for(int i=0 ; i<length2 ; i++) {
			if(userList.get(i) == userList.get(num)) {
				flag++;
			}
		}
		return(flag);
		
	
	}														// dublicate bloðu
	
	public static boolean addDouble (int num3) {			// addDouble... sayýnýn double olduðuna karar verilince buraya gelir
															// sayýnýn daha önce doubleListte olup olmadýðýný kontrol eder
		if (doubleList.contains(userList.get(num))) {
			control=false;
		}
		return(control);
	}														//// addDouble...
	
	public static boolean addMultiple (int num4) {
		if (multipleList.contains(userList.get(num))) {
			control=false;
		}
	
		return(control);
	}
	
}
