package bean;

public class Diretor{
	
	private String nomeDiretor;
	private String dataNascimento;

	public Diretor(String nome, String dataNascimento) {
		super();
		this.nomeDiretor = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNomeDiretor() {
		return nomeDiretor;
	}
	public void setNomeDiretor(String nome) {
		this.nomeDiretor = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
