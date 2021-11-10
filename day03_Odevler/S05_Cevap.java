package day03_Odevler;

import java.util.Scanner;

public class S05_Cevap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan = new Scanner(System.in);	
		
	System.out.println("Lütfen isminiz giriniz : ");
	
	String isim = scan.nextLine();
	
	System.out.println("Lütfen soyisminiz giriniz : ");
	
	String soyisim = scan.nextLine();
	
	System.out.println("Isminiz : " + isim);
	System.out.println("Soyisminiz : " + soyisim);
	System.out.println("Kursumuza katiliminiz alinmiştir, teşekkur ederiz");
	
	scan.close();
	}

}
