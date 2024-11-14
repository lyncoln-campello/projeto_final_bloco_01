package model;

public class Bolo extends Doces {

	private int tamanho;
	
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Bolo( int tipoBolo,int tamanho ) {
		super(tipoBolo);
		this.tamanho = tamanho;
		


	}

}
