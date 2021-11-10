package day10_PratikDersi_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

	Scanner scan=new Scanner(System.in);
	System.out.print("Boyunuzu cm olarak giriniz");
	double boy=scan.nextDouble();
	
	System.out.print("Kilonuzu kg olarak giriniz");
	double kilo=scan.nextDouble();
	
	double vki = kilo / (boy/100*boy/100);
	
	if (vki<=20) {
		
		System.out.println("oldukca zayıfsınız");
		
	} else if (20<vki && vki<=25)  {

		System.out.println("Normal sınırdasınız");
		
	} else if (vki<=30)  {

		System.out.println("sisman sınız");
	} else if (vki>30)  {

		System.out.println("Obezsizin");
	
	}
	
		
    }

}
