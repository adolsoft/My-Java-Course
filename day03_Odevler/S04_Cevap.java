package day03_Odevler;

import java.util.Scanner;

public class S04_Cevap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner scan = new Scanner(System.in);
		
	  System.out.println("Diktörgenler Prizmasının Uzunluğunu Giriniz = ");
	  
	  int uzunluk = scan.nextInt();
	  
	  System.out.println("Diktörgenler Prizmasının Yüksekliğini Giriniz = ");
	  
	  int yukseklik = scan.nextInt();
	  
	  System.out.println("Diktörgenler Prizmasının Genişliğini Giriniz = ");
	  
	  int genislik = scan.nextInt();
	  
	  // Hacim = Uzunluk * Yükseklik * Genişlik
	  
	  int hacim = uzunluk * yukseklik * genislik;
	  
	  System.out.println("Diktörgenler Prizmasının Hacmi = " + hacim );
	  
	  scan.close();
	  
	}

}
