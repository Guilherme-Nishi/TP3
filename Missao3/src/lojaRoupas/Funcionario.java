package lojaRoupas;
import java.util.*;
public class Funcionario extends Pessoa {
	private double identificador;
	
	public Funcionario(String n,Double i,String s){
		nome=n;
		identificador=i;
		senha=s;
		
	}
	
	public String toString() {
		return "Nome do funcionário: " + nome + ", ID do funcionário" + identificador+" senha do funcionário "+senha;
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
	
	public Endereco getEndereco(){
		return endereco;
		
	}
	
	public void   setEndereco(Endereco endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
}