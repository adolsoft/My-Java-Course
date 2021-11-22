package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C07_Array {

	public static void main(String[] args) {
		// verilen iki array'i birleştiren
		// ve sonucu birlesikArray isimleri bir array'e kaydeden
		// bir method oluşturun.
				
				int arr1[]= {3,5,7,10};
				int arr2[]= {2,4,6,8,9};

				int birlesikArray[]=birlesik(arr1,arr2);
				Arrays.sort(birlesikArray);
				System.out.println(Arrays.toString(birlesikArray));
			}

			private static int[] birlesik(int[] arr1, int[] arr2) {
				
				int birlesikArray[]= Arrays.copyOf(arr1, arr1.length+arr2.length);
				// {3,5,7,10,0,0,0,0,0};
				
				
				for (int i = 0; i < arr2.length; i++) {
					birlesikArray[arr1.length+i]=arr2[i];	
				
			}
				
				
				return birlesikArray;
			}

		}
