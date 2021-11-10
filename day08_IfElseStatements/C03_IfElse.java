package day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		// Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 
		//65buyuk ve eşitse “Emekli olabilirsin” yazdirin

		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz");
        int yas=scan.nextInt();
        
        if (yas>=65) {
        	
			System.out.println("Emekli Olabilirisiniz");
		
        } else {
		
        	System.out.println("Emekli Olamazsınız");
		
        }
		scan.close();
	}

}
