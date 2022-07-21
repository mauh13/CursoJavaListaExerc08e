package lista08_Matrizes_Extra;

import java.util.Random;

public class Lista8Q01e_SomaCubos {

	public static void main(String[] args) {
		Random numAle = new Random();
		
		int cuboA [][][] = new int [10][3][5];
		int cuboB [][][] = new int [10][3][5];
		int cuboC [][][] = new int [10][3][5];
		
		System.out.println("Matriz CUBO A\n");
		
		for (int i=0; i<cuboA.length; i++) {
			for (int j=0; j<cuboA[i].length; j++) {
				for (int k=0; k<cuboA[i][j].length; k++) {
					cuboA[i][j][k] = numAle.nextInt(50);
					System.out.print(cuboA[i][j][k] + "\t");
				}
				System.out.println("Coluna " + j);
			}
			System.out.println("Linha " + i);
		}
		
		System.out.println("\nMatriz CUBO B\n");
		
		for (int i=0; i<cuboB.length; i++) {
			for (int j=0; j<cuboB[i].length; j++) {
				for (int k=0; k<cuboB[i][j].length; k++) {
					cuboB[i][j][k] = numAle.nextInt(50);
					System.out.print(cuboB[i][j][k] + "\t");
				}
				System.out.println("Coluna " + j);
			}
			System.out.println("Linha " + i);
		}
		
		System.out.println("\nMatriz CUBO C\n");
		
		for (int i=0; i<cuboC.length; i++) {
			for (int j=0; j<cuboC[i].length; j++) {
				for (int k=0; k<cuboC[i][j].length; k++) {
					cuboC[i][j][k] = cuboA[i][j][k] + cuboB[i][j][k];
					System.out.print(cuboC[i][j][k] + "\t");
				}
				System.out.println("Coluna " + j);
			}
			System.out.println("Linha " + i);
		}

	}

}
