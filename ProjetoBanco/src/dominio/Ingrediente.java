package dominio;

public class Ingrediente {
	
	private String codigoReceita;
	private String seqIngrdiente;
	private String descricao;
	private float quantidade;
	private int unidade;
	public String getCodigoReceita() {
		return codigoReceita;
	}
	public void setCodigoReceita(String codigoReceita) {
		this.codigoReceita = codigoReceita;
	}
	public String getSeqIngrdiente() {
		return seqIngrdiente;
	}
	public void setSeqIngrdiente(String seqIngrdiente) {
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
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	
	

}
