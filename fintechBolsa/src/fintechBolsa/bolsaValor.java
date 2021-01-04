package fintechBolsa;

import java.util.Scanner;

public class bolsaValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARO A MATRIZ pACAO QUE IRÁ RECEBER OS VALORES
		double pAcao[][] = new double [2][7];
		
		/* DECLRACAO DO OBJETO LEITOR, CLASSE SCANNER PARA FAZER INPUT VIA TECLADO */
		Scanner leitor = new Scanner(System.in);
		
		/* AQUI EU FAÇO UM FOR PARA PERCORRER A MATRIZ E ARMAZENAR OS VALORES ATRAVES DE INPUT VIA TECLADO */
		for(int linha = 0; linha <= pAcao.length -1; linha ++) {
			for (int coluna = 0; coluna <= pAcao[0].length -1; coluna ++) {
				System.out.printf("Digite o valor da ação na Semana %d dia %d", linha, coluna);
				pAcao[linha][coluna] = leitor.nextDouble();
			}
			System.out.print("\n");
		}
			
		
		/* AQUI EU PERCORRO A MATRIZ PARA EXIBIR OS VALORES ARMAZENADOS */
		for(int linha = 0; linha <= pAcao.length -1; linha ++) {
			for (int coluna = 0; coluna <= pAcao[0].length -1; coluna ++) {
				System.out.print(pAcao[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		
		/* AQUI EU PERCORRO A MATRIZ E FAÇO SUM DOS VALORES ARMAZENADOS, FAÇO TBM E UM CONTADOR PARA CONSEGUIR CALCULAR A MEDIA */
		double soma = 0;
		double mediaSemanal =0;
		double mediaMensal =0;
		int contadorT = 0;
		for(int linha = 0; linha <= pAcao.length -1; linha ++) {
			for (int coluna = 0; coluna <= pAcao[0].length -1; coluna ++) {
				soma+=pAcao[linha][coluna];
				contadorT++;		
			}
			/* AQUI EU DEVO CALCULAR A MEDIA SEMANAL E EXIBIR A MAIOR A MENOR MEDIA*/

		}
		
		/* EXIBIÇÃO DE RESULTADOS */
		mediaMensal = soma/contadorT;
		System.out.println("Media Mensal: " + mediaMensal);
		System.out.print("\n");
				
			
				

	}

}
