package day10_PratikDersi_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lutfen iki sayı giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Toplama için -->1 giriniz.\nÇıkarmak için -->2 giriniz.\nÇarpma için -->3 giriniz.\nBölmek için -->4 giriniz.\n ");
		
		int islem=scan.nextInt();
		
		if (islem==1) {
			
			System.out.println("Girdiğiniz Sayıların Toplamı :" +(sayi1 + sayi2));
			
		} else if (islem==2){
			
			System.out.println("Girdiğiniz Sayıların Farkı :" +(sayi1 - sayi2));
			
		} else if (islem==3){
			
			System.out.println("Girdiğiniz Sayıların Çarpımı :" +(sayi1 * sayi2));
			
		} else if (islem==4){
			
			System.out.println("Girdiğiniz Sayıların Bölümü :" +(sayi1 / sayi2));
		} else {
			
			System.out.println("Lutfen istenilen islem sayılarını giriniz");
		}
		
		scan.close();
	}

}
