package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        /*
         * 1- Verilen sayi1 ve sayi2 variable�larinin degerlerini degistiren (SWAP) bir program yaziniz
            Orn : sayi1=10 ve sayi2=20;
            kod calistiktan sonra
            sayi1=20 ve sayi2=10
         */
		
		int sayi1 = 10 ;
		
		int sayi2 = 20 ;
		
		System.out.println("baslangicta Sayi1="+sayi1+" ve Sayi2="+sayi2);

		int bosSayi;
		
		bosSayi = sayi2;
		sayi2=sayi1;
		sayi1=bosSayi;
		
		System.out.println("Sonu�ta Sayi1="+sayi1+" ve Sayi2="+sayi2);
		
		
	}

}
