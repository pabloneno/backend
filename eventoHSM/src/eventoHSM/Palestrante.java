package eventoHSM;

class Palestrante {
	
	/*nome, contato e valor de uma hora de sua palestra.*/
	
	private String nomePalestrante;
	private String emailContato;
	private float valorHora;
	
	void infoPalestrante() {
			System.out.println("\nNome Palestrante: " + this.getNomePalestrante());
			System.out.println("Contato: " + this.getEmailContato());
			System.out.println("Valor da hora: " + this.getValorHora());

			
	}
	
	
	Palestrante(String nomePalestrante, String emailContato, float valorHora) {
		this.nomePalestrante = nomePalestrante;
		this.emailContato = emailContato;
		this.valorHora = valorHora;
	}

	public String getNomePalestrante() {
		return nomePalestrante;
	}
	public void setNomePalestrante(String nomePalestrante) {
		this.nomePalestrante = nomePalestrante;
	}
	public String getEmailContato() {
		return emailContato;
	}
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	

}
