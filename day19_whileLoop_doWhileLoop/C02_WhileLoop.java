package day19_whileLoop_doWhileLoop;


import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen rakamları toplamı bulmak için pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();
        
        int rakamlarToplami=0;
        int rakam=0;
        
      while(sayi>0) {
    	  
    	  rakam=sayi%10;
    	  rakamlarToplami+=rakam;
    	  sayi/=10;
    	}
      
      System.out.println("girdigimiz sayının rakamlar toplamı :"+rakamlarToplami);
     
      
      // for loop ile yapalımm
      
      
      rakamlarToplami=0;
      rakam=0;
      
      String sayiStr=""+sayi;
      
      
     for (int i = 0; i < sayiStr.length(); i++) {
    	 rakam=sayi%10;
    	 rakamlarToplami+=rakam;
    	 sayi/=10;
	} 
     
     System.out.println("girdigimiz sayının rakamlar toplamı :"+rakamlarToplami);
     scan.close();
	}

}
