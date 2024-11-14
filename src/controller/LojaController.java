package controller;

import java.util.ArrayList;

import model.Doces;
import repository.Repository;

public class LojaController implements Repository {

	private ArrayList<Doces> listaDoces = new ArrayList<>();
	int numero = 0;

	    @Override
		public void adicionar(Doces doces) {
			listaDoces.add(doces);
			System.out.println("\nO doce de tipo " + doces.getTipoBolo() + " foi adicionado ao carrinho");
		}

		@Override
		public void listarTodas() {
			for (var doces : listaDoces) {
				doces.visualizar();
			}
		}

		@Override
		public void atualizar(Doces doce) {
			var buscaDoces = buscarNaCollection(doce.getTipoBolo());

			if (buscaDoces != null) {
				listaDoces.set(listaDoces.indexOf(buscaDoces), doce);
				System.out.println("\nO produto de tipo " + doce.getTipoBolo() + " foi atualizado com sucesso!");
			} else {
				System.out.println("\nO produto de tipo " + doce.getTipoBolo() + " não foi encontrado!");
			}
		}
		
		@Override
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