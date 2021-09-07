package lojaRoupas;

public class Categoria {
	private String tamanhoProduto;
	private String classificaçaoProdutoSexo;
	private String  classificaçaoProdutoEtaria;
	
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto=tamanhoProduto;
	}
	
	public String getClassificaçaoProdutoSexo() {
		return classificaçaoProdutoSexo;
	}
	
	public void setClassificaçaoProdutoSexo(String classificaçaoProdutoSexo) {
		this.classificaçaoProdutoSexo=classificaçaoProdutoSexo;
	}
	
	public String getClassificaçaoProdutoEtaria() {
		return classificaçaoProdutoEtaria;
	}
	
	public void setClassificaçaoProdutoEtaria(String classificaçaoProdutoEtaria) {
		this.classificaçaoProdutoEtaria=classificaçaoProdutoEtaria;
	}
}