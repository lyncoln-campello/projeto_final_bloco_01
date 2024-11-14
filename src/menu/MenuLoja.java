package menu;

import java.io.IOException;
import java.util.Scanner;

public class MenuLoja {

	public static void main(String[] args) {
		int opcao, tipoBolo, tamanho;
		Scanner leia = new Scanner(System.in);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  DOCES DO JÃO                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar ao Carrinho                ");
			System.out.println("            2 - Listar produtos do Carrinho          ");
			System.out.println("            3 - Atualizar Produtos                   ");
			System.out.println("            4 - Exclui item do Carrinho              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nDoces do Jão \nA Vida também pode ser Doce!  ");
				sobre();

				leia.close();

			}

			switch (opcao) {
			case 1:
				System.out.println("Adicionar ao Carrinho\n\n");

				System.out.println("Escolha o Sabor do Bolo: ");
				System.out.println("1 - Chocolate");
				System.out.println("2 - Baunilha");
				System.out.println("3 - Morango");

				System.out.println("Digite o bolo desejado: ");
				leia.skip("\\R?");
				tipoBolo = leia.nextInt();

				System.out.println("Escolha o Tamanho do Bolo: ");
				System.out.println("1 - Pequeno (R$30)");
				System.out.println("2 - Médio (R$60)");
				System.out.println("3 - Grande (R$90)");

				System.out.println("Digite o  Tamanho do bolo: ");
				leia.skip("\\R?");
				tamanho = leia.nextInt(); 

				keyPress();
				break;
			case 2:
				System.out.println("Listar produtos do Carrinho\n\n");

				keyPress();
				break;
			case 3:
				System.out.println("Atualizar Produtos\n\n");

				keyPress();
				break;
			case 4:
				System.out.println("Exclui item do Carrinho\n\n");

				keyPress();
				break;
			default:
				System.out.println("\n\\nOpção Inválida!\\n\n");
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
