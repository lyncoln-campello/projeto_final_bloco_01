package menu;

import java.io.IOException;
import java.util.Scanner;

import controller.LojaController;
import model.Bolo;
import model.Doces;

public class MenuLoja {
	public static void main(String[] args) {

		int opcao, tipoBolo, tamanho;
		Scanner leia = new Scanner(System.in);

		LojaController lojaController = new LojaController();

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                  DOCES DO JÃO                       ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Adicionar ao Carrinho                ");
			System.out.println("            2 - Listar produtos do Carrinho          ");
			System.out.println("            3 - Atualizar Produtos                   ");
			System.out.println("            4 - Excluir item do Carrinho             ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada: ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nDoces do Jão - A Vida também pode ser Doce!");
				sobre();
				leia.close();
				break;
			}

			switch (opcao) {
			case 1:
				System.out.println("Adicionar ao Carrinho\n");
				System.out.println("Escolha o Sabor do Bolo: ");
				System.out.println("1 - Chocolate");
				System.out.println("2 - Baunilha");
				System.out.println("3 - Morango");

				System.out.print("Digite o sabor do bolo desejado: ");
				tipoBolo = leia.nextInt();

				System.out.println("\n\nEscolha o Tamanho do Bolo: ");
				System.out.println("1 - Pequeno (R$30)");
				System.out.println("2 - Médio (R$60)");
				System.out.println("3 - Grande (R$90)");

				System.out.print("Digite o tamanho do bolo: ");
				tamanho = leia.nextInt();

				Doces doce = new Bolo(tipoBolo, tamanho);
				lojaController.adicionar(doce);
				
				keyPress();
				break;
			case 2:
				System.out.println("Listar produtos do Carrinho\n");
				lojaController.listarTodas();
				
				keyPress();
				break;
			case 3:
				System.out.println("Atualizar Produtos\n");
				System.out.print("Digite o tipo do bolo que deseja atualizar: ");
				tipoBolo = leia.nextInt();

				System.out.print("Digite o novo tamanho do bolo: ");
				tamanho = leia.nextInt();

				Doces boloAtualizado = new Bolo(tipoBolo, tamanho);
				lojaController.atualizar(boloAtualizado);
				keyPress();
				break;
			case 4:
				System.out.println("Excluir item do Carrinho\n");
				System.out.print("Digite o tipo do bolo que deseja excluir: ");
				tipoBolo = leia.nextInt();

				lojaController.excluir(tipoBolo);
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				
				keyPress();
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Lyncoln Campello - lyncolncamp@gmail.com");
		System.out.println("https://github.com/lyncoln-campello");
		System.out.println("*********************************************************");

	}

	public static void keyPress() {

		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
