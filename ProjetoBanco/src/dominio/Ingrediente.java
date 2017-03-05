package dominio;

public class Ingrediente {
	
	private String codigoReceita;
	private int seqIngrdiente;
	private String descricao;
	private float quantidade;
	private String unidade;
	public String getCodigoReceita() {
		return codigoReceita;
	}
	public void setCodigoReceita(String codigoReceita) {
		this.codigoReceita = codigoReceita;
	}
	public int getSeqIngrdiente() {
		return seqIngrdiente;
	}
	public void setSeqIngrdiente(int seqIngrdiente) {
		this.seqIngrdiente = seqIngrdiente;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	

}
