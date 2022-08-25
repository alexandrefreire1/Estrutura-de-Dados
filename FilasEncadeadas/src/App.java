import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/*
		 * Filas fila = new Filas();
		 * 
		 * fila.enqueue(1); fila.enqueue(2); fila.enqueue(3); fila.enqueue(4);
		 * System.out.println(fila);
		 * 
		 * fila.dequeue(); System.out.println(fila);
		 */
		
		// Lista 01 - Nota 2

		Scanner scan = new Scanner(System.in);

		CallCenter fila = new CallCenter();
		int opcao = 0;

		while (opcao != 4) {
			System.out.println("::: Call Center :::");
			System.out.println("1 - Inserir Contato: ");
			System.out.println("2 - Proximo Contato: ");
			System.out.println("3 - Imprimir Contato: ");
			System.out.println("4 - Sair");
			System.out.print("\nSelecione uma opcao: ");
			opcao = scan.nextInt();

			if (opcao==1) {
				Filas contato = new Filas();
				String nome, tel;

				System.out.print("Nome do contato: ");
				nome = scan.next();
				System.out.print("Telefone: ");
				tel = scan.next();

				contato.enqueue(nome);
				contato.enqueue(tel);
				fila.enqueue(contato);
			} else if(opcao==2) {
				System.out.println(fila.getInicio().getElemento());
				fila.dequeue();
			} else if(opcao==3) {
				System.out.println("Lista de Contato: " + fila);
			} else {
				System.out.println("Fim do programa!");
			}
		}
	}
}
