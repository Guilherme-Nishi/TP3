package lojaRoupas;

public class Categoria {
	private String tamanhoProduto;
	private String classificaçaoProdutoSexo;
	private String  classificaçaoProdutoEtaria;
	
	public Categoria (String t , String cla , String et) {
		tamanhoProduto=t;
		classificaçaoProdutoSexo=cla;
		classificaçaoProdutoEtaria=et;
	}
	
	public String toString() {
		return "O tamanho do produto : " + tamanhoProduto+"  sexo: "+classificaçaoProdutoSexo+"  Faixa etaria : "+ classificaçaoProdutoEtaria;
	}
	
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