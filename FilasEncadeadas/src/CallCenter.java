import java.util.Scanner;

public class CallCenter extends Filas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CallCenter fila = new CallCenter();
		int opcao = 0;
		
		switch(opcao) {
		case 1: System.out.println("1 - Inserir Contato: ");
		
		case 2: System.out.println("2 - Proximo Contato: ");
		case 3: System.out.println("3 - Imprimir Contato: ");
		case 4: System.out.println("4 - Sair");
		System.out.println("Selecione uma opção: ");
		opcao = scan.nextInt();
		}
		
		if(opcao==1) {
			Filas contato = new Filas();
			String nome, tel;
			
			System.out.print("Nome do contato: ");
			nome = scan.next();
			System.out.print("Telefone: ");
			tel = scan.next();
			
			contato.enqueue(nome);
			contato.enqueue(tel);
			fila.enqueue(contato);
		}
	}
}
