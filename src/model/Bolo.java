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
		switch (getTipoBolo()) {
		case 1 ->System.out.println("Sabor do bolo: Chocolate");

		case 2 -> System.out.println("Sabor do bolo: Baunilha");
		
		case 3 -> System.out.println("Sabor do bolo: Morango");
		}
		
		switch (this.tamanho) {
		case 1 -> System.out.println("  Tamanho: Pequeno");
		case 2 -> System.out.println("  Tamanho: Médio");
		case 3-> System.out.println("  Tamanho: Grande");
		}
		System.out.print("Preço: R$ " + getPreco());
	
		
	}
}