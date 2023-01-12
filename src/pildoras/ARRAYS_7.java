package pildoras;
import java.util.Arrays;
public class ARRAYS_7 {



		public static void main(String[] args) {
			
			int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
			int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
			boolean isSort = false;
			int aux;
			for (int i = 0; i < listado1.length - 1; i++)
				for (int j = 0; j < listado1.length - 1; j++)
					if (listado1[j] > listado1 [j +1]) {
						aux = listado1 [j];
						listado1[j] = listado1 [j+1];
						listado1 [j+1] = aux;
					}
					
			// Implementa una forma de saber si el array está ordenado o no
			// Almacena el resultado en la variable isSort
			System.out.println(Arrays.toString (listado1));
			System.out.println(Arrays.toString (listado2));
			if (isSort=true)
				System.out.println("El vector está ordenado");
			else
				System.out.println("El vector NO está ordenado");
		}

	}


