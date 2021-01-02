package nextLevel;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa {
	
	/*
	 * A Next Level, uma moderna e conceituada universidade, necessita de um sistema de gestão acadêmico.
Para o projeto piloto de implantação do sistema, você deve criar um programa que permita calcular a 
média semestral dos alunos.
A média semestral é a média aritmética simples das médias bimestrais. 
As médias bimestrais são compostas pelas seguintes atividades: prova (peso 3), 
projeto (peso 3), lista de exercícios (2) e contribuição em projetos de software livre/ 
conclusão de MOOCs recomendados pelo docente (3).
Os dados devem ser obtidos a partir de input pelo teclado e o programa deve exibir se o aluno foi aprovado ou reprovado. 
Considere que o aluno deve ser aprovado se obtiver nota igual ou maior que 8.
Caso o aluno tenha média menor que 8, determine também a nota mínima necessária para a 
pontuação na prova final, de forma que o aluno garanta aprovação na disciplina. Para tal, basta subtrair do valor 10,00 
o valor da média.
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
		
		System.out.println("A media semestral do aluno é: " + df.format(mediaSemestral) );
		
		if(mediaSemestral >= 8) {
			System.out.println("Aprovado!");
		}
		else {
			double nFinal = 10 - mediaSemestral;
			System.out.println("Reprovado!\n Nota Minima para aprovação em exame final: " + df.format(nFinal));
		}

	}

}
