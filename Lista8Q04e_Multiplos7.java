package lista08_Matrizes_Extra;

import java.util.Scanner;

public class Lista8Q04e_Multiplos7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz [][] = new int [10][5];
		int tamanho = 0;
		int pos = 0;
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print("Informe o valor para a posição [" + i + "][" + j + "]: ");
				matriz[i][j] = leia.nextInt();
				if (matriz[i][j] % 7 == 0) {
					tamanho++;
				}
			}
		}
		//System.out.println(tamanho);
		
		int multiploSete [] = new int [tamanho];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] % 7 == 0) {
					multiploSete[pos] = matriz[i][j];
					pos++;
				}
			}
			
		}
		
		System.out.println("\nMatriz 10 x 5:\n");
		
		for (int lin [] : matriz) {
			for (int col : lin) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nVetor múltiplos de 7:\n");
		
		for (int lin : multiploSete) {
				System.out.print(lin + " ");
		}
			

		leia.close();

	}

}
