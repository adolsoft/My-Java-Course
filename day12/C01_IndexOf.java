package day12;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen varlıgını kontrol etmek için bir harf veriniz");
		
		char krk =scan.next().charAt(0);
		
		int index = cumle.indexOf(krk);
		
		if (index<0) {
			
			System.out.println("girdiginiz harf cümlede yok");
			
		} else {
			
			System.out.println("girdigini harf cümlede var");
		}
	}

}
