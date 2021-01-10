package eventoHSM;

class Palestra {
	/*palestra deve ter um título, horário de início, palestrante, uma descrição e carga horária.*/
	
	private String titulo;
	private String horarioInicio;
	private String nomePalestrante;
	private String Descricao;
	private float cargaHoraria;
	private String nomeResponsavel;
	
	void infoPalestra() {
		System.out.println("\nTitulo da Palestra: " + this.getTitulo());
		System.out.println("Descrição da Palestra: " + this.getDescricao());
		System.out.println("Palestrante: " + this.getNomePalestrante());
		System.out.println("Horario da Palestra: " + this.getHorarioInicio());
		System.out.println("Duração: " + this.getCargaHoraria());
		System.out.println("Responsavel: " + this.getNomeResponsavel());
		
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getNomePalestrante() {
		return nomePalestrante;
	}

	public void setNomePalestrante(String nomePalestrante) {
		this.nomePalestrante = nomePalestrante;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public float getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public String getNomeResponsavel() {
		return nomeResponsavel;
	}


	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	
	
	

}
