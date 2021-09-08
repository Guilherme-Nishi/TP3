package lojaRoupas;


public class Venda {
	private String numerovenda;
	private Produto produto;
	private Cliente cliente;
	
	public String getNumerovenda() {
		return numerovenda;
	}
	
	public void setNumeroVenda(String numerovenda) {
		this.numerovenda=numerovenda;
	}
	
	public Produto getProduts() {
		return produto;
	}
	
	public Produto setProduto(Produto produto) {
		return produto;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente=cliente;
	}
	}