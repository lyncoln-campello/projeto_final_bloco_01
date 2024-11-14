package controller;

import java.util.ArrayList;

import model.Doces;

public class LojaController {

	private ArrayList<Doces> listaDoces = new ArrayList<>();
	int numero = 0;

	
		public void adicionar(Doces doces) {
			listaDoces.add(doces);
			System.out.println("\nO doce de tipo " + doces.getTipoBolo() + " foi adicionado ao carrinho");
		}

		
		public void listarTodas() {
			for (var doces : listaDoces) {
				doces.visualizar();
			}
		}

		
		public void atualizar(Doces doce) {
			var buscaDoces = buscarNaCollection(doce.getTipoBolo());

			if (buscaDoces != null) {
				listaDoces.set(listaDoces.indexOf(buscaDoces), doce);
				System.out.println("\nO produto de tipo " + doce.getTipoBolo() + " foi atualizado com sucesso!");
			} else {
				System.out.println("\nO produto de tipo " + doce.getTipoBolo() + " não foi encontrado!");
			}
		}
		
		
		public void excluir(int tipoBolo) {
			var doces = buscarNaCollection(tipoBolo);
			
			if (doces != null) {
				listaDoces.remove(doces);
				System.out.println("\nO doce de tipo " + tipoBolo + " foi deletado com sucesso!");
			} else {
				System.out.println("\nO doce de tipo " + tipoBolo + " não foi encontrado!");
			}
		}

		
		public Doces buscarNaCollection(int tipoBolo) {
			for (var doce : listaDoces) {
				if (doce.getTipoBolo() == tipoBolo) {
					return doce;
				}
			}
			return null;
		}
	}