package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// preIncrement ve post increment sadece sayi++ veya sayi-- yazimi icin gecerlidir
        int sayi=10;
        
        sayi++;
        sayi++;
        sayi++;
        
        System.out.println(sayi); // 13
        
        
        System.out.println(sayi++); // 13  bu satirda iki islem var
                                    // bir artirma , bir de yazdirma 
        System.out.println(sayi); // 14
        
        // once artirmak sonra yazdirmak isterseniz ++sayi
        // once yazdirmak sonra artirmak isterseniz sayi++
        
        System.out.println(++sayi); // 15 

	}

}
