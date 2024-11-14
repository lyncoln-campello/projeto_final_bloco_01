package model;

public class Bolo extends Doces {

	private int tamanho;

	public Bolo(int tipoBolo, int tamanho) {
		super(tipoBolo);
		this.tamanho = tamanho;
		setPreco(preco(tamanho)); 
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
		setPreco(preco(tamanho));
	}

	private float preco(int tamanho) {
		switch (tamanho) {
		case 1:
			return 30.0f;
		case 2:
			return 60.0f;
		case 3:
			return 90.0f;
		default:
			return 0.0f;
		}
	}

	public void visualizar() {
		System.out.println("Sabor do bolo: " + getTipoBolo());
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Preço: R$ " + getPreco());
	}
}