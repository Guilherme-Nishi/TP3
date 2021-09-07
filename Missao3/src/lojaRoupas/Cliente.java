package lojaRoupas;

public class Cliente extends Pessoa {

	private String emailCliente;
	private Cartao cartaoCliente;
	private Endereço endereco;
	
	public Cliente (String n,String s) {
		nome=n;
		senha=s;
		

	}
	
	public String toString() {
		return "nome do aluno:"+nome;
		
		
	}
	public  String getNome(){
		return nome;
		
	}
	
	public void   setNome(String nome) {
		this.nome=nome;
		
	}
	
	public  Cartao getCartao(){
		return cartaoCliente;
		
	}
	
	public void   setCartao(Cartao cartaoCliente) {
		this.cartaoCliente=cartaoCliente;
		
	}
	public Endereço getEndereco(){
		return endereco;
		
	}
	
	public void   setEndereço(Endereço endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getEmail(){
		return emailCliente;
		
	}
	
	public void   setEmail(String emailCliente) {
		this.emailCliente=emailCliente;
		
	}
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
	
	
}
