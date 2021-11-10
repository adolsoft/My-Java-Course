package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar 
		//uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Diktorgenin bir kenar uzunlugunu giriniz");
        double kenar1=scan.nextDouble();
        System.out.println("Lutfen Diktorgenin diger kenar uzunlugunu giriniz");
        double kenar2=scan.nextDouble();
        
        if (kenar1==kenar2) {
			System.out.println("Girilen ölcüler kare oluşturu");
		} else {
			System.out.println("Girilen ölcüler kare değildir");
		}
		scan.close();
	}

}
