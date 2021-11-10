package day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		/*
		Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin. 
        Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın. 
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.  
		Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamaklı bir sayı giriniz");
		
		int sayi = scan.nextInt();
		
	     if (sayi < 1000 || sayi > 9999) {
	    	 
	    	 System.out.println("4 Basamarlı pozitif sayi giriniz");
			
		} else { // 4 basamaklı sayılar burada digerleri yukarıda elendi
						
			if (sayi%5==00) { // bese tam bolunenler
				
				if (sayi%10==0) { //son rakam 0
					
					System.out.println(" bese tam bölünen cift sayı ");
					
				} else { // son rakam 5

					System.out.println(" bese tam bölünen tek sayı ");
				}
				
			} else { // bese tam bolunemeyenler
				
				System.out.println("Lutfen tekrar deneyiniz");

			}
			
		}
	     scan.close();
	}

}
