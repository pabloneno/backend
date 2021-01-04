import java.util.Arrays;
import java.util.Scanner;

public class notasAcademicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a quantidade de Alunos a serem inseridos: ");
		
		int quantidade = leitor.nextInt();
		
		
		double s[]  = new double[quantidade];
		double p1[] = new double[quantidade];
		double pr1[] = new double[quantidade];
		double ex1[] = new double[quantidade];
		
		double p2[] = new double[quantidade];
		double pr2[] = new double[quantidade];
		double ex2[] = new double[quantidade];
		
		double p3[] = new double[quantidade];
		double pr3[] = new double[quantidade];
		double ex3[] = new double[quantidade];
		
		for (int i =1; i< quantidade; i++) {
			System.out.println("Digite as notas do 1 Bimestre do Aluno "+ i);
			p1[i] = leitor.nextDouble();
			pr1[i] = leitor.nextDouble();
			ex1[i] = leitor.nextDouble();

			System.out.println("Digite as notas do 2 Bimestre do Aluno "+ i);
			p2[i] = leitor.nextDouble();
			pr2[i] = leitor.nextDouble();
			ex2[i] = leitor.nextDouble();

			System.out.println("Digite as notas do 3 Bimestre do Aluno "+ i);
			p3[i] = leitor.nextDouble();
			pr3[i] = leitor.nextDouble();
			ex3[i] = leitor.nextDouble();
			
			s[i]= (((( p1[i] * 5 ) +	( pr1[i] 	* 3	) +	(ex1[i] * 2)) / 10) + ((( p2[i] * 5 ) +	( pr2[i] 	* 3	) +	(ex2[i] * 2)) / 10) + ((( p3[i] * 5 ) +	( pr3[i] 	* 3	) +	(ex3[i] * 2)) / 10)) / 3;
			
			if(s[i] >= 8) {
				System.out.printf("Aluno %d Aprovado com media %f", i, s[i]);
			} else if (s[i] >= 5) {
				System.out.printf("Aluno %d deverá realizar a Avaliação Final (AF). Media %f", i, s[i]);
			} else {
				System.out.printf("Aluno %d Reprovado com media %f", i, s[i]);
			}
		}
		
		
		for (int i=0; i < s.length; i++) {
			Arrays.sort(s);
			System.out.println(Arrays.toString(s));
			
		}
		
		int counter = 0;
		for (int i = 0; i < s.length; i ++) {
		    if (s[i] >= 8) {
		        counter ++;
		    }
		    
		}
		System.out.println("Aprovados: " + counter);

		int counter2 = 0;
		for (int i = 0; i < s.length; i ++) {
		    if (s[i] < 8 && s[i] >= 5) {
		        counter2 ++;
		    }
		    
		}
		System.out.println("Em Recuperação AF: " + counter2);
		
		int counter3 = 0;
		for (int i = 0; i < s.length; i ++) {
		    if (s[i] < 5 ) {
		        counter3 ++;
		    }
		    
		}
		System.out.println("Repovados: " + counter3);
		
		double soma = 0;
		double mediaGeral =0;
		for (int i = 0; i < s.length; i ++) {
			soma+=s[i];
		    mediaGeral = soma /s.length;
		}
				
		System.out.println("Media Geral: " + mediaGeral);		
				
		
	}	
}
