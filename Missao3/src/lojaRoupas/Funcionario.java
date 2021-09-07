package lojaRoupas;

public class Funcionario extends Pessoa {
	private double identificador;
	
	public Funcionario(String n,double i,String s){
		nome=n;
		identificador=i;
		senha=s;
		
	}
	
	public String toString() {
		return "Nome do funcionário: " + nome + ", ID do funcionário" + identificador;
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
	
	public Endereço getEndereco(){
		return endereco;
		
	}
	
	public void   setEndereço(Endereço endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
}