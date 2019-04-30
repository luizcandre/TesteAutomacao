package bean;

public class Filme extends Diretor{
	
	public Filme(String nome, String dataNascimento) {
		super(nome, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	private String nome;
	private String anoLancamento;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	

}
