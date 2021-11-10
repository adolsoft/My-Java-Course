package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        double sayi=scan.nextDouble();
        
        System.out.println(sayi>0 ? "Sayi Pozitif":sayi*sayi);
        
		scan.close();
	}

}
