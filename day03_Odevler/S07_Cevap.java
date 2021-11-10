package day03_Odevler;

import java.util.Scanner;

public class S07_Cevap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Lütfen isminiz giriniz : ");
		
		String isim = scan.nextLine();
		
		System.out.println("isminizi baş harfi : " + isim.charAt(0));
		
		scan.close();
	}

}
