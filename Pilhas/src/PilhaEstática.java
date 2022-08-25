public class PilhaEstática {
	
	// 1ª QUESTÃO
	
	static final int MAX = 1000;
	int topo;
	int tam[] = new int[MAX];
	
	public PilhaEstática() {
		this.topo = -1;
	}
	
	// Inserindo elemento na Pilha (método push)
	public boolean push(int x) {
		if(this.topo >= (MAX-1)) {
			return false;
		} else {
			tam[++topo] = x;
			return true;
		}
	}
	
	// Verificar se a Pilha está vazia (método isEmpty)
	public boolean isEmpty() {
		return topo < 0;
	}
	
	// Verifica o tamanho da Pilha (método size)
	public int size() {
		if(this.isEmpty()) return 0;
		return this.topo+1;
	}
	
	// Retorna o elemento e Remove da Pilha (método pop)
	public int pop() {
		if(this.isEmpty()) {
			return 0;
		}else {
			int x = tam[topo--];
			return x;
		}
	}
	
	// Imprime o topo da pilha (método top)
	public int top() {
		if(this.isEmpty()) return 0;
		return topo;
	}
	
}
