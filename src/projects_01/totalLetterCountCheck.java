package Projects_01;

import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */

    /*
     Bir String verildiÄŸinde

     Eger String harf sayisi tek ise true print et deÄŸilse false print et

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line
        // kodu burdan baÅŸlatÄ±n ve bu satÄ±rdan Ã¶nceki kodlarÄ± deÄŸiÅŸtirmeyin
    	// code Start here don't change before this line
		// kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin
		
		String wordFormatlı= word.replaceAll("[^a-zA-Z]", "");
		
		int harfSayisi=wordFormatlı.length();
		System.out.println(wordFormatlı);
		if (harfSayisi%2==0) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
	scanner.close();	
}
}