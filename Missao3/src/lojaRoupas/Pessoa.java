package lojaRoupas;

public abstract  class Pessoa {

	protected String nome;
	protected String senha;
	protected Endereco endereco ;
	
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome=nome;	
		
	}
	
	public String getSenha() {
		return senha;
		}
	public void setSenha(String senha) {
		this.senha=senha;	
			
		}
	
	public Endereco getEndereco() {
		return endereco;
		}
	public void setEndereco(Endereco endereco) {
		this.endereco=endereco;	
			
		}
	
	
}

