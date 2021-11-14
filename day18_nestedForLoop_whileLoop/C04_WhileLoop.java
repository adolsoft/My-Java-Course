package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devap edin
		// kullanici sifira bastiginda,
		// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		

		int sayi=1;
		int toplam=0;
		int sayac=0;

		while (sayi!=0) {
		
			System.out.println("Toplamak için sayı giriniz.\nBitirmek için 0 basınız");
			sayi = scan.nextInt();
			
		   toplam+=sayi;
		   sayac++;
			   
		}
		
		System.out.println("Toplam :"+toplam + " Taplanan sayı adeti :"+(sayac-1) );
		scan.close();
	}

}
