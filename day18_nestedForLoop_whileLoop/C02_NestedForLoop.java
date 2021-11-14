package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
				// girdigi sayiya gore asagidaki sekli yazdirin
				// orn : 3 girilirse
				// 1
				// 1 2
				// 1 2 3
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("10 dan kucuk pozitif bir tam sayı giriniz");
		int sayi1 = scan.nextInt();
		
		if (sayi1 <= 10 && sayi1 > 0) {
			
			for (int i = 1; i<=sayi1; i++) {
				//System.out.print(i + " ");
				
				for (int j = 1; j <= i; j++) {
					
					System.out.print(j + " ");
				}
				
				System.out.println("");
			}
			
		} else {
			System.out.println("Lutfen 10 veya daha kücük bir sayı giriniz");			
		}
scan.close();
	}

}
