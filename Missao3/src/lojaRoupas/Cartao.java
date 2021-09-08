
package lojaRoupas;
public class Cartao {

	private double numeroCartao;
	private int codigoseg;
	private String nomeCartao;
	private String dataVenc;
	private Cliente cliente;
	
	public Cartao (Double n, int i , String no , String d  ) {
		numeroCartao=n;
		codigoseg=i;
		nomeCartao=no;
		dataVenc=d;
	}
	
	public String toString() {
		return "Nome do cartao:  "+ nomeCartao +"  numero do cartao: "+ numeroCartao + "  codigo de seguranca: "+ codigoseg + "  data de vencimento: "+ dataVenc;
	}
	
	public double getNumeroCartao() {
		return numeroCartao;
	}
	
	public void setNumeroCartao(double numeroCartao) {
		this.numeroCartao=numeroCartao;
	}
	
	public int getCodigoseg() {
		return codigoseg;
	}
	
	public void setCodigoseg(int codigoseg) {
		this.codigoseg=codigoseg;
	}
	
	public String getNomeCartao() {
		return nomeCartao;
	}
	
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao=nomeCartao;
	}
	
	public String getDataVenc() {
		return dataVenc;
	}
	
	public void setDataVenc(String dataVenc) {
		this.dataVenc=dataVenc;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		 this.cliente=cliente;
	}
}