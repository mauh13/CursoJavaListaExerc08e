package lista08_Matrizes_Extra;

import java.util.Scanner;

public class Lista8Q02e_Gabarito {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0;
		int total = 0;
		
		System.out.print("Informe quantos alunos serão avaliados: ");
		n = leia.nextInt();
		
		char gabarito [] = new char[5];
		char respostas [][] = new char[n][6];
		
		System.out.println("\nDefina o gabarito (a, b, c, d ou e):");
		for (int i = 0; i<gabarito.length; i++) {
			System.out.print("Qual a resposta para a questão nº " + (i+1) + ": ");
			gabarito[i] = leia.next().charAt(0);
		}
		
		System.out.print("\nInforme os dados dos alunos:");
		for (int i = 0; i<respostas.length; i++) {
			for (int j = 0; j<respostas[i].length; j++) {
				if (j == 0) {
					System.out.print("\nInforme a matricula do " + (i+1) +"º aluno: ");
					respostas[i][j] = leia.next().charAt(0);
				} else {
					System.out.print("Informe a resposta da questão nº " + j +": ");
					respostas[i][j] = leia.next().charAt(0);
				}
			}
		}
		
		System.out.println("\nGabarito:");
		
		for (int i = 0; i<gabarito.length; i++) {
			System.out.print("Questão " + (i+1) + " = " + gabarito[i] + "\t");
		}
		
		/*	//alternativa para percorrer o vetor (ou matriz)
		 
			for(char lin : gabarito) { // cria uma variavel "espelho" que percorre o vetor
			  System.out.print(lin + "\t"); // aqui pode fazer o que quiser, no caso imprimir
		}
		*/	
		
		System.out.println("");
		System.out.println("\nResultados:");
		
		for(char[] lin : respostas) {// quando matriz fazer encadeado e usar o colchetes
			 for(char col : lin) {
				 System.out.print(col + "\t");
			 }
			 System.out.println("");
		 }
     		
		for (int i = 0; i<respostas.length; i++) {
			for (int j = 1; j<respostas[i].length; j++) {
				if (respostas[i][j] == gabarito[j-1]) {
					total++;
				}
			}
			System.out.print("\nA nota do aluno com matricula " + respostas[i][0] + " é " + (total*2));
			total = 0;
		}

		leia.close();

	}

}
