package day15_nethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/*
		 * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		 * Kullanici 2,3 veya 4 degerini girerse, 
		 * kullanicidan bu sayilari girmesini isteyin
		 *  ve sayilarin toplamini yazdirin. 
		 *  Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		 *   “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen toplamak istediginiz sayı adedini 2,3 ve 4 den biri olarak secin");
	
		int tercih = scan.nextInt();
								
		switch (tercih) {
		case 2:
			ikiSayiTopla();
			break;
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
		default:
			System.out.println("gecersiz tercih");
			break;
		}
		
		scan.close();
	}

	private static void dortSayiTopla() {
		
		System.out.println(sayigir() + sayigir() + sayigir()+sayigir());
		
	}

	private static void ucSayiTopla() {
		System.out.println(sayigir() + sayigir() + sayigir());
		
	}

	private static void ikiSayiTopla() {
		
		System.out.println(sayigir() + sayigir());
		
	}

	public static int sayigir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Toplanacak Sayı Giriniz");
		return scan.nextInt();
		//System.out.println(sayi);
	
		
		
		
	}

	
}
