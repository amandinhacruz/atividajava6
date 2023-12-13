package atividadejava6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao = 1;
		Queue<String> filaBanco = new LinkedList<String>(); 
		String cliente;
		
		while (opcao != 0) {
		System.out.println("*** ** Menu ** ***");
		
		System.out.println("1 - Adicionar Cliente na fila.");
		
		System.out.println("2 - Listar todos os Clientes.");
		
		System.out.println("3 - Retirar Cliente da fila.");
		
		System.out.println("0 - Sair."); 
		
		System.out.println("Digite uma opção:");
		opcao = leia.nextInt(); 
		leia.nextLine();
       
		switch (opcao) {
	case 1 : System.out.println("Digite um nome: ");
	         cliente = leia.nextLine();
	          System.out.println("Fila: " + cliente + " Cliente adicionado!");
	        filaBanco.add(cliente);
	       break;
	case 2 : System.out.println(filaBanco);
	         break;
	case 3 : filaBanco.remove();
		System.out.println("A fila está vazia ");        
	         break;
	case 0 : System.out.println("Menu finalizado!");      

}
	}
		
}
}
