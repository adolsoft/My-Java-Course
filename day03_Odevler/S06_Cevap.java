package day03_Odevler;

import java.util.Scanner;

public class S06_Cevap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);	
		
		System.out.println("L�tfen isminiz giriniz : ");
		
		String isim = scan.nextLine();
		
		System.out.println("L�tfen soyisminiz giriniz : ");
		
		String soyisim = scan.nextLine();
		
		System.out.println("isim - soyisim : " + isim + " " + soyisim) ;
		
		scan.close();
	}

}
