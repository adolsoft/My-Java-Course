package day10_ternary_SwitchCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir değişken + ile baska bir 
		// değişkenle işleme sokulursa java bunları yan yana ekler.
		// buna Concatenation denir
		
		String isim = "Ali";
		String soyisim = "Can";
		
		System.out.println(isim + " " + soyisim);//AliCan
		
		//ayni islemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));//AliCan
		
		System.out.println(isim.concat(" ").concat(soyisim));
	}

}
