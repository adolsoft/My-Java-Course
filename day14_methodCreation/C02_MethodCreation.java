package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		
		// Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin

/*
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("İki Sayı ile Dört İşlem");
		
		System.out.print("Sayı 1: ");
		double sayi1 = girdi.nextInt();
		
		System.out.print("Sayı 2: ");
		double sayi2 = girdi.nextInt();
		
		System.out.print("Yapılacak İşlemi Girin (T (toplam) - F (fark) - C (çarpma) - B (bölme)): ");
		String islemTuru = girdi.next();

		System.out.println("Sonuç: "+Sonuc(sayi1, sayi2, islemTuru));
		
	}

	public static double Sonuc(double sayi1, double sayi2, String islemTuru) {
		if(islemTuru.equals("T")) {
			return sayi1+sayi2;
		} else if(islemTuru.equals("F")) {
			if(sayi1-sayi2 > 0) {
				return sayi1-sayi2;
			} else {
				return sayi2-sayi1;
			}
		} else if(islemTuru.equals("C")) {
			return sayi1*sayi2;
		} else if(islemTuru.equals("B")) {
			return sayi1/sayi2;
		} else {
			return 0;
		}
		*/
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen iki sayı giriniz\nilk sayıdan sonra enter basın");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("girilen sayıların kareleri toplamı istiyorsan 2 "
				+ "\nkupler toplamı istiyorsanız 3 basınız");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			kareTopla(sayi1, sayi2);
			break;
		case 3:
			kupTopla(sayi1, sayi2);
			break;
		default:
			System.out.println("Lutfen istenilen değerleri giriniz");
			break;
		}
		
		//kareTopla(sayi1, sayi2);
		//kupTopla(sayi1, sayi2);
		
		
		/*
		 * Bir method'u 4 adimla olustururuz.
		 * 1- method'u javaya oluşturabilmek için method call yapıyoruz
		 * 2- arguman ihtiyacı varmı belirleyelim
		 * 3- javadan yardım alarak method olusturalım
		 * 4- axcess modifier ve return type'a karar ver
		 * bundan sonra methodun yapacagı islevi gercekleştirecek kodları yazarız
		 */
		
		
		
	}

	private static void kupTopla(double a, double b) {
		// TODO Auto-generated method stub

		double karelerToplami= a*a*a + b*b*b;
		System.out.println("Girilen sayıların kareleri toplamı ="+karelerToplami);
	}

	public static void kareTopla(double a, double b) {
		// bizi arguman isimlerimizle parametle isimleri aynı olmak zorunda değil
		// java isimlere degil degerlere bakar
		
		double karelerToplami= a*a+b*b;
		System.out.println("Girilen sayıların kareleri toplamı ="+karelerToplami);
		
	}
}
		



