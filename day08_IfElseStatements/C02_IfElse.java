package day08_IfElseStatements;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen 
		//karakterin harf olup olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter yaziniz");
        
        
        char karakter=scan.next().charAt(0);
        
        int asciiKod=(int)karakter;
        
        if ((karakter >='A' && karakter <='Z') || (karakter >='a' && karakter <='z')) {
			
        	System.out.println("Girdiğiniz karakter haftir :"+ karakter);
        	
		} else {

			System.out.println("Girdiginiz karakter harf değildir");
		}
		
        if ((asciiKod >=65 && asciiKod <=90) || (asciiKod >=97 && asciiKod <=122)) {
			
        	System.out.println("Girdiğiniz karakter haftir :"+ karakter);
        	
		} else {

			System.out.println("Girdiginiz karakter harf değildir");
		}
		scan.close();
        
	}

}
