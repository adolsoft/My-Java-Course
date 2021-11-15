package day19_whileLoop_doWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
	//	Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.
		
		
		// ======== For Loop Kullanıldı ============
		for (char i = 'm'; i > 'c'; i--) {
			
			System.out.print(i + " ");
		}
		
		//========== while Loop kullanıldı ==========
 		System.out.println(" ");
		char krk='m';
		while (krk > 'c') {
			System.out.print(krk + " ");
			krk--;
		}
		
		//======= Do while kullanıldı ===============
		
		System.out.println(" ");
		char krk1='m';
		
		do {
			System.out.print(krk1 + " ");
			krk1--;
		} while (krk1 > 'c');
		
	}

}
