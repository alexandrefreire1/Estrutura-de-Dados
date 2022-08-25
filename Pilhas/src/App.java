
public class App {

	public static void main(String[] args) {
		
		// Criando pilha
		PilhaEstática pilha = new PilhaEstática();
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		pilha.push(6);
		
		System.out.println("Topo da Pilha: " + pilha.top());
		System.out.println("---------------------------------");
		
		pilha.push(7);
		
		System.out.println("Novo Topo da Pilha: " + pilha.top());
		System.out.println("Removendo... " + pilha.pop());
		System.out.println("Topo da Pilha apos remocao: " + pilha.top());
		System.out.println("A pilha esta vazia? " + pilha.isEmpty());
		System.out.println("\nTamanho da Pilha: " + pilha.size());
		
	}
}
