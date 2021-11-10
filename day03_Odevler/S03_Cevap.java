package day03_Odevler;

import java.util.Scanner;

public class S03_Cevap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Dairenin Yaricapını Giriniz  =");
		
		double yariCap = scan.nextDouble();
		
		double piSayisi = 3.14;
		
		//Cemberin cevresi 2*piSayısı*yariCap
		
		double cemberinCevresi = 2*piSayisi*yariCap;
		
		//Dairenin Alanı piSayısı*yariCap*yariCap
		
		double daireninAlani = piSayisi*yariCap*yariCap;
		
		System.out.println("Cemberin Cevresi = " + cemberinCevresi + " " + "Dairenin Alanı = " + daireninAlani);
		
		scan.close();
	}

}
