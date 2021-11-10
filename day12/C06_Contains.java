package day12;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		
		/*
		 * Soru 1) Kullanicidan email adresini girmesini isteyin, 
		 * mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”, 
		 * @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , 
		 * @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		 * 
		 */
		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir mail adresi giriniz ");
		
		String email=scan.nextLine();
		
		int uzunluk=email.length();
		
		System.out.println(uzunluk);
		
		int index=email.lastIndexOf("@gmail.com");
		
		System.out.println(index);
				
		if (!email.contains("@gmail.com")) {
			
			System.out.println("Email adresiniz giriniz");
		} else if (index==uzunluk-10) {
			
			System.out.println("Email başarıyla kaydedildi");
			
		} else {
			
			System.out.println("Lutfen yazımı kontrol ediniz");
		}
		
		
	}

}
