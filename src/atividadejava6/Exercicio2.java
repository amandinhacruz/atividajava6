package atividadejava6;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack <String> estanteDeLivros = new Stack<String>();
		int opcao = 1;
		String livro;
		while (opcao != 0) {
			System.out.println("*** **MENU** ***");
			
			System.out.println("1 - Adicionar Livro na pilha.");
			
			System.out.println("2 - Listar todos os livros.");
			
			System.out.println("3 - Retirar livro da pilha");
			
			System.out.println("0 - Sair");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
		case 1 : System.out.println("Digite o nome do livro:");
		        livro = leia.nextLine();
		        estanteDeLivros.push(livro);
		        System.out.println("Estante atualizada: " +livro+ " foi adicionado!");
		 break;      
		case 2 : System.out.println("Estante de livros: " +estanteDeLivros);
		 break;
		case 3 : if(estanteDeLivros.isEmpty()) {
			System.out.println("Estante de livros está vazia");	
		} else {
			estanteDeLivros.pop();
			System.out.println("Um livro foi retirado!");
			System.out.println("Estante atualizada: " + estanteDeLivros);
		}
		 break;
		case 0 : System.out.println("Menu finalizado!");
		} 

	}

}
}
