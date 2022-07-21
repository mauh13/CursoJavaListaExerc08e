package lista08_Matrizes_Extra;

import java.util.Scanner;

public class Lista8Q03e_SimetricaProfe {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] =  new int[2][2];

		for (int i=0;i < matriz.length;i++){
			for (int j=0; j<matriz.length; j++){
				System.out.print("Digite um número inteiro para a linha " + i + " e coluna " + j);
				matriz[i][j] = leia.nextInt();
			}
		}
		for (int i=0;i < matriz.length;i++){
			for (int j=i+1; j<matriz.length; j++){
				if (matriz[i][j] != matriz[j][i]) {
					System.out.println("A matriz nao e simetrica.");
					break;
				}else {
					System.out.println("A matriz e simetrica.");
				}
			}
		}

		leia.close();
	}

}
