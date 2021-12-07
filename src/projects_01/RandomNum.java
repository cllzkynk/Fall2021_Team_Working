package Projects_01;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



 /*

    Veri tipi integer olan max sayısı verildiğinde

    0 ile max sayisi arasindan random bir sayi elde et(olustur)

    output tipi int olmalı


  */
    @SuppressWarnings("unused")
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // System.out.print("bir sayi giriniz : ");
       // int max=scanner.nextInt();
 //double s=scanner.nextDouble();
        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

        Random r=new Random(); //random s�n�f�
     int a=r.nextInt(scanner.nextInt());
                               //50
     //   System.out.println(a);
    
     
     
     
    // double rast=Math.random()+1;
    // System.out.println("Rastgele sayimiz  "+ rast );
        

        
        int arada=r.nextInt((35)+1)+20;
        System.out.println(arada);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  scanner.close();
    }
}