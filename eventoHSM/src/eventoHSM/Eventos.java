package eventoHSM;

import java.util.ArrayList;
import java.util.List;


public class Eventos {

	public static void main(String[] args) {

		Palestra p1 = new Palestra();
		p1.setTitulo("Java Guanabara");
		p1.setCargaHoraria(8);
		p1.setDescricao("Aprenda Java com Orientação objetos nessa série de 30 aulas");
		p1.setHorarioInicio("18h");
		p1.setNomePalestrante("Gustavo Guanabara");
		p1.setNomeResponsavel("Pablo");

		Palestra p2 = new Palestra();
		p2.setTitulo("Python Guanabara");
		p2.setCargaHoraria(16);
		p2.setDescricao("Aprenda Python com Orientação objetos nessa série de 30 aulas");
		p2.setHorarioInicio("20h");
		p2.setNomePalestrante("Gustavo Guanabara");	
		p2.setNomeResponsavel("Pablo");

		Palestra p3 = new Palestra();
		p3.setTitulo("Aprendendo Libras");
		p3.setCargaHoraria(40);
		p3.setDescricao("Aprenda Libras com quem fala libras");
		p3.setHorarioInicio("20h");
		p3.setNomePalestrante("Ana Claudia");	
		p3.setNomeResponsavel("Ana");

		Palestra p4 = new Palestra();
		p4.setTitulo("Daniel e Apocalipse");
		p4.setCargaHoraria(16);
		p4.setDescricao("Aprenda Daniel e Apocalipse com Felipe Silva");
		p4.setHorarioInicio("20h");
		p4.setNomePalestrante("Felipe Silva");	
		p4.setNomeResponsavel("Ana");
		
		
		Responsavel re1 = new Responsavel();
		re1.setNomeResponsavel("Pablo");
		re1.setNumTelefone("71992092623");
		re1.setValorHora(26);
		
		Responsavel re2 = new Responsavel();
		re2.setNomeResponsavel("Ana");
		re2.setNumTelefone("988599600");
		re2.setValorHora(32);
		
		List<Responsavel> responsaveis = new ArrayList<Responsavel>();
		responsaveis.add(re1);
		responsaveis.add(re2);
		
		
		List<Palestra> palestras = new ArrayList<Palestra>();
		palestras.add(p1);
		palestras.add(p2);
		palestras.add(p3);
		palestras.add(p4);
		

		float valorPorResponsavel = 0;
		

		
		System.out.println(valorPorResponsavel);


	}

}
