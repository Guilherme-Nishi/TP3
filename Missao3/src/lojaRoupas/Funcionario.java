package lojaRoupas;

public class Funcionario extends Pessoa {
	private double identificador;
	
	public Funcionario(String n,double i,String s){
		nome=n;
		identificador=i;
		senha=s;
		
	}
	
	public String toString() {
		return "Nome do funcion�rio: " + nome + ", ID do funcion�rio" + identificador;
	}
	public double getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(double identificador) {
		this.identificador=identificador;
	}
	public  String getNome(){
		return nome;
		
	}
	
	public void   setNome(String nome) {
		this.nome=nome;
		
	}
	
	public Endere�o getEndereco(){
		return endereco;
		
	}
	
	public void   setEndere�o(Endere�o endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
}