package model;

public abstract class Doces {

	private int tipoBolo;
	private float preco;

	public Doces(int tipoBolo) {
		this.tipoBolo = tipoBolo;
	}

	public int getTipoBolo() {
		return tipoBolo;
	}

	public void setTipoBolo(int tipoBolo) {
		this.tipoBolo = tipoBolo;
	}

	public float getPreco() {
		return preco;
	}

	protected void setPreco(float preco) {
		this.preco = preco;
	}

	public abstract void visualizar();
}