package listaExtra2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ListaEncadeada lista = ListaEncadeada.criaAgenda();
		boolean i = true;
		Scanner scan = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		while(i == true) {
			System.out.println("\n");
			System.out.println(lista.menu());
			System.out.println("====AGENDA DE CONTATOS====");
			System.out.println("Selecione uma das Opções: ");
			opcao = scan.nextInt();
					
			if (opcao == 1) {
				Contato novo = new Contato();
				System.out.println("Nome: ");
				String nome = teclado.nextLine();
				novo.setNome(nome);
				
				System.out.println("Telefone: ");
				String telefone = teclado.nextLine();
				novo.setTelefone(telefone);
				
				System.out.println("Email: ");
				String email = teclado.nextLine();
				novo.setEmail(email);
				
				System.out.println("Data de Nascimento: ");
				String data = teclado.nextLine();
				novo.setDataNasc(data);
				
				lista.insereContato(novo);
			}
			else if (opcao == 2) {
				System.out.println(lista);
			}
			else if (opcao == 3) { 
				System.out.println("Digite o nome do Contato: ");
				String nome = teclado.nextLine();
				lista.buscaContato(nome);
			}
			else if (opcao ==4 ) {
				System.out.println("Digite o nome do Contato a ser Atualizado: ");
				String nome = teclado.nextLine();
				lista.atualizaContato(lista.pegarContato(nome));
			}			
			else if (opcao == 5) {
				System.out.println("Digite o nome do Contato a ser removido: ");
				String nome = teclado.nextLine();
				lista.removeContato(nome);
			}
			else if(opcao == 6) {
				System.out.println();
				break;
			}
		}
	}
}

