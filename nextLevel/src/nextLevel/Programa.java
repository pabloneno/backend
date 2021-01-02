package nextLevel;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa {
	
	/*
	 * A Next Level, uma moderna e conceituada universidade, necessita de um sistema de gest�o acad�mico.
Para o projeto piloto de implanta��o do sistema, voc� deve criar um programa que permita calcular a 
m�dia semestral dos alunos.
A m�dia semestral � a m�dia aritm�tica simples das m�dias bimestrais. 
As m�dias bimestrais s�o compostas pelas seguintes atividades: prova (peso 3), 
projeto (peso 3), lista de exerc�cios (2) e contribui��o em projetos de software livre/ 
conclus�o de MOOCs recomendados pelo docente (3).
Os dados devem ser obtidos a partir de input pelo teclado e o programa deve exibir se o aluno foi aprovado ou reprovado. 
Considere que o aluno deve ser aprovado se obtiver nota igual ou maior que 8.
Caso o aluno tenha m�dia menor que 8, determine tamb�m a nota m�nima necess�ria para a 
pontua��o na prova final, de forma que o aluno garanta aprova��o na disciplina. Para tal, basta subtrair do valor 10,00 
o valor da m�dia.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double mediaSemestral;
		double prova, nProjetos, nLista, nMooc;
		int p1 =3 , p2 =3, p3 =2, p4 =3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("INFORME O VALOR DA PROVA: ");
		prova = ler.nextDouble();
		
		System.out.print("INFORME O VALOR DA NOTA EM PROJETOS: ");
		nProjetos = ler.nextDouble();
		
		System.out.print("INFORME O VALOR DA NOTA EM LISTA DE EXERCICIOS: ");
		nLista = ler.nextDouble();
		
		System.out.print("INFORME O VALOR DA NOTA OBTIDA EM CONTRIBUICOES DE PROJETO SW / MOOCs: ");
		nMooc = ler.nextDouble();
		
		mediaSemestral = ((prova * p1) + (nProjetos * p2) + (nLista * p3) + (nMooc * p4)) / (p1+p2+p3+p4) ;
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		System.out.println("A media semestral do aluno �: " + df.format(mediaSemestral) );
		
		if(mediaSemestral >= 8) {
			System.out.println("Aprovado!");
		}
		else {
			double nFinal = 10 - mediaSemestral;
			System.out.println("Reprovado!\n Nota Minima para aprova��o em exame final: " + df.format(nFinal));
		}

	}

}
