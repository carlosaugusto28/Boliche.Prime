package ProvaPoo;

public class Alimento {

	private String Nome;
	private Double Preço;
	private int qntd;
	private int CardapioId;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getPreço() {
		return Preço;
	}
	public void setPreço(Double preço) {
		Preço = preço;
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
