package eventoHSM;

class Palestra {
	/*palestra deve ter um t�tulo, hor�rio de in�cio, palestrante, uma descri��o e carga hor�ria.*/
	
	private String titulo;
	private String horarioInicio;
	private String nomePalestrante;
	private String Descricao;
	private float cargaHoraria;
	private String nomeResponsavel;
	
	void infoPalestra() {
		System.out.println("\nTitulo da Palestra: " + this.getTitulo());
		System.out.println("Descri��o da Palestra: " + this.getDescricao());
		System.out.println("Palestrante: " + this.getNomePalestrante());
		System.out.println("Horario da Palestra: " + this.getHorarioInicio());
		System.out.println("Dura��o: " + this.getCargaHoraria());
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
