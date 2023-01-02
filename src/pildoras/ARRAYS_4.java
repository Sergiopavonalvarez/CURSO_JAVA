package pildoras;

import java.util.Iterator;

public class ARRAYS_4 {

	public static void main(String[] args) {

		int[][] matrix = new int[4][5];

		matrix[0][0] = 15;
		matrix[0][1] = 21;
		matrix[0][2] = 18;
		matrix[0][3] = 9;
		matrix[0][4] = 15;

		matrix[1][0] = 10;
		matrix[1][1] = 52;
		matrix[1][2] = 17;
		matrix[1][3] = 19;
		matrix[1][4] = 7;

		matrix[2][0] = 19;
		matrix[2][1] = 2;
		matrix[2][2] = 19;
		matrix[2][3] = 17;
		matrix[2][4] = 7;

		matrix[3][0] = 92;
		matrix[3][1] = 13;
		matrix[3][2] = 13;
		matrix[3][3] = 32;
		matrix[3][4] = 42;

		for (int i = 0; i < 4; i++) {

			System.out.println();

			for (int j = 0; j < 5; j++) {

				System.out.print(" " + matrix[i][j]);
			}

		}

	}
}
