package Projects_01;

import java.util.Arrays;
import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


     /*
     3 tane pozitif String verildiğinde
     sayısal olmayan tüm karakterleri kaldırın.
     Stringleri int e çevirin
     ve total print edin

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        NOT : Eğer output 0 dan küçük ise outputu -1 e cevir





    */
    @SuppressWarnings("unused")
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın

for (int i = 0; i < elements.length; i++) {
	elements[i]=elements[i].replaceAll("\\D", "");
}

System.out.println("Sadece sayilardan olusan array : "+Arrays.toString(elements));
int toplam=0;
for (int i = 0; i < elements.length; i++) {
	toplam+=Integer.parseInt(elements[i]);
}

if (toplam>=0) {
	System.out.println("Sayilardan olusan arrayin toplami : "+toplam);
}else {
	System.out.println("-1");
}
scanner.close();

    }
}
