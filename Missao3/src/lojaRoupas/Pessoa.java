package lojaRoupas;

public abstract  class Pessoa {

	protected String nome;
	protected String senha;
	protected String endereco ;
	
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
	
	public String getEndereco() {
		return endereco;
		}
	public void setEndereco(String endereco) {
		this.endereco=endereco;	
			
		}
	
	
}

