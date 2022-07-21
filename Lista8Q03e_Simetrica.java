package lista08_Matrizes_Extra;

import java.util.Scanner;

public class Lista8Q03e_Simetrica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int cont = 0;

		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				System.out.print("Digite um número inteiro para a linha " + i + " e coluna " + j + ": ");
				matriz[i][j] = leia.nextInt();
			}
		}
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				if (matriz[i][j] == matriz[j][i]) {
					cont++;
				}
			}
		}
		
		System.out.println();
		
		for (int lin [] : matriz) {
			for (int col : lin) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		
		//System.out.println(cont);
				
		if (cont == (matriz.length*matriz.length)) {
			System.out.println("\nÉ uma matriz simétrica");			
		} else {
			System.out.println("\nNão é uma matriz simétrica");
		}

		leia.close();
	}

}
