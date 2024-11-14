package model;

public abstract class Doces {

	private int tamanho;
	private int tipoBolo;
	
	public Doces(int tipoBolo ) {
		this.tipoBolo = tipoBolo;
	}


	public int getTipoBolo() {
		return tipoBolo;
	}

	public void setTipoBolo(int tipoBolo) {
		this.tipoBolo = tipoBolo;
	}

	