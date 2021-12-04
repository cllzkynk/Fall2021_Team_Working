package Projects_02;

import java.util.Arrays;

public class sumTotal {

	/*
	 * Create String 2D array
	 * 
	 * {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
	 * 
	 * if the String has $ multiply by 3.2
	 * 
	 * if the String has € multiply by 4.2
	 * 
	 * return the double
	 * 
	 */

	/*
	 * String 2D array oluştur
	 * 
	 * {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
	 * 
	 * String de $ varsa 3.2 ile çarp
	 * 
	 * String de € varsa 4.2 ile çarp
	 * 
	 * double return et
	 * 
	 */
	public static void main(String[] args) {

//        Koda burdan başlayın

		String arrS[][] = { { "$12", "$22", "5$" }, { "€9", "€40", "$1", "$2" }, { "€12" } };

		// System.out.printf(Arrays.deepToString(carp(arrS)));
		
		
		
	
		 System.out.printf(Arrays.deepToString(carp(arrS)));
		
		
		


	}

	public static String[][] carp(String[][] arrS) {
		for (int i = 0; i < arrS.length; i++) {
			for (int j = 0; j < arrS[i].length; j++) {
				if (arrS[i][j].contains("$")) {
 					
					 arrS[i][j] = ""+String.format("%.2f", (Double.valueOf(arrS[i][j].replaceAll("\\D", ""))*3.2));

					
					//arrS[i][j] =""+( Double.valueOf(arrS[i][j].replaceAll("\\D", ""))*3.2);
				} else if (arrS[i][j].contains("€")) {
				
					//arrS[i][j] =""+( Double.valueOf(arrS[i][j].replaceAll("\\D", ""))*4.2);
					 arrS[i][j] = ""+String.format("%.2f", (Double.valueOf(arrS[i][j].replaceAll("\\D", ""))*4.2));
				}
			}
		}

		return  arrS;

	}
}
