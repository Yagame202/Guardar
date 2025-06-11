package Todos;

import java.util.Arrays;

public class MatrizTemperatura {

	public static void main(String[] args) {
		int [][] temperaturas = {{22, 25, 28},
								 {27, 22, 23}		
								 };
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[i].length; j++) {
				System.out.println(temperaturas [i][j]);
			}
		}
	}                                                                             
}
