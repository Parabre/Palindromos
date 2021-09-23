package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;
import model.PilhaString;

public class Principal {

	public static void main(String[] args) {
		PalindromoController controller = new PalindromoController();
		PilhaString pilha = new PilhaString();

		boolean exibeMenu = true;
		while (exibeMenu) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções \n "
					+ "1- Inserir nova palavra \n 2- Verificar todas as palavras" + "\n 3- Sair"));
			
			switch (opcao) {
			case 1:
				String palavra = String.valueOf(JOptionPane.showInputDialog(null, "Digite uma palavra para adicionar"));
				pilha.push(palavra);
				break;
			case 2:
				if(pilha.isEmpty()) System.out.println("Não existem palavras para verificar");
				while (!pilha.isEmpty()) {
					try {
						String palavraInvertida = controller.invertePalavra(pilha.top());
						Boolean palindromo = controller.comparaPalavras(pilha.top(), palavraInvertida);
						String mensagem = palindromo ? " é um palindromo" : " não é um palindromo";
						System.out.println("A palavra "+ pilha.pop() + mensagem);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				exibeMenu = false;
				break;
			default:
				System.err.println("Escolha uma opção entre 1 a 3");
				break;
			}
		}

	}
}
