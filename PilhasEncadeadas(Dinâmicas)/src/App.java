public class App {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push(100, 0);
		pilha.push(300, 0);
		pilha.push(500, 0);
		
		System.out.println("Topo: " + pilha.top());
		System.out.println("Tamanho: " + pilha.size());
		
		pilha.pop();
		System.out.println(pilha.size());
	}
}
