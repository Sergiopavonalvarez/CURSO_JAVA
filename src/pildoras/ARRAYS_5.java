package pildoras;

import java.util.Iterator;

public class ARRAYS_5 {

	public static void main(String[] args) {
		
		int [][]matrix= {
				
				{10,15,18,19,21},
				{5,6,56,45,34},
				{89,56,9,98,45},
				{56,9,98,56,4}
				
		};
		
		for (int []fila: matrix) {
			
			System.out.println();
			
			for (int z: fila) {
				
				System.out.print(z + " ");
				
			}
		}
	}
}
