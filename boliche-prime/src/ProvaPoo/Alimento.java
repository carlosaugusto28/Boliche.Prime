package ProvaPoo;

public class Alimento {

	private String Nome;
	private Double Pre�o;
	private int qntd;
	private int CardapioId;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getPre�o() {
		return Pre�o;
	}
	public void setPre�o(Double pre�o) {
		Pre�o = pre�o;
	}
	public int getQntd() {
		return qntd;
	}
	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	public int getCardapioId() {
		return CardapioId;
	}
	public void setCardapioId(int cardapioId) {
		CardapioId = cardapioId;
	}
}
