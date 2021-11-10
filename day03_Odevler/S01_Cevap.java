package day03_Odevler;

import java.util.Scanner;

public class S01_Cevap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Birinci Tam Sayıyı Giriniz :");
		
		int sayi1 = scan.nextInt();
		
	    System.out.println("Lütfen Ikinci Tam Sayıyı Giriniz :");
	    
	    int sayi2 = scan.nextInt();
		
	    int toplam = sayi1+sayi2;
	    int fark = sayi1-sayi2;
	    int carpim = sayi1*sayi2;
	   
	    
	    System.out.println("İki sayının Toplamı ="+toplam);
	    System.out.println("İki sayının Farkı ="+fark);
	    System.out.println("İki sayının Carpımı ="+carpim);
	    scan.close();
		
	}

}
