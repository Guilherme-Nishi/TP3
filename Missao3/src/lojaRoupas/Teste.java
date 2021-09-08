package lojaRoupas;

import java.util.*;
public class Teste {
	
	 static Funcionario f;
	 static Cartao c;
	 static Endereco ed;
	 static Categoria ct;
	 static Produto p;
	 static Cliente cl;
	
	public static  void main(String[] args){
		f= new Funcionario("Guilherme",99.99,"12345");
		c= new Cartao(1234.567,814,"Guilherme","17/03");
		ed=new Endereco("73094520","Rua Jardins",23,"em frente a praça");
		ct= new Categoria("GG","Masculino","Adulto");
		p=new Produto("Camisa social",198.99,90,"vermelho");
		cl=new Cliente ("José","233343","messi@hotmail.com");
		
		System.out.println(f.toString());
		System.out.println(c.toString());
		System.out.println(ed.toString());
		
		System.out.println(ct.toString());
		System.out.println(p.toString());
		System.out.println(cl.toString());
		
	}
	

	
}