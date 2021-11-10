package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
	// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	// Kullanicidan bir sifre girmesini isteyin
	// Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. 
	// Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
	// Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. 
	// Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen bir şifre giriniz");
	
	char ilkKarakter = scan.next().charAt(0);
	
	if (ilkKarakter>='A' && ilkKarakter<='Z') { //büyük harfleri secmiş olacak
		
		if (ilkKarakter=='A') {
			
			System.out.println("Gecerli Şifre");
			
		} else {

			System.out.println("Geçersiz Şifre");
			
		}
	
	} else if (ilkKarakter>='a' && ilkKarakter<='z') { //büyük harfleri secmiş olacak

		if (ilkKarakter=='z') {
			
			System.out.println("Gecerli Şifre");
			
		} else {

			System.out.println("Geçersiz Şifre");
			
		}

	
	} else { 
		
		System.out.println("Geçerli şifre olabilmesi için harf ile başlayın");
	
	}

	scan.close();
	
   }
}
