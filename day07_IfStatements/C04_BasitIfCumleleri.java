package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Diktorgenin bir kenar uzunlugunu giriniz");
        double kenar1=scan.nextDouble();
        System.out.println("Lutfen Diktorgenin diger kenar uzunlugunu giriniz");
        double kenar2=scan.nextDouble();
        
        if (kenar1==kenar2) {
        	System.out.println("girilen diktorgen kare ");
			
		}
        if (kenar1!=kenar2) {
        	System.out.println("girilen diktorgen kare degil ");
		}

	}

}
