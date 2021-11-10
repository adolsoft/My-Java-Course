package day03_Odevler;

import java.util.Scanner;

public class S02_Cevap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variable tanımlamalarım
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Karenin Bir Kenar Uzunluğunu Giriniz  =");
		
		int kareKenarUzunlugu = scan.nextInt();
		
		int kareninCevresi = kareKenarUzunlugu * 4;
		
		int kareninAlani = kareKenarUzunlugu * kareKenarUzunlugu ;
		
		System.out.println("Karenin Cevresi = " + kareninCevresi + " "+ "Karenin Alani = " + kareninAlani);
		
		scan.close();
	}

}
