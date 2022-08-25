public class Pilha {

	static final int MAX = 1000;
	public No topo;
	int tam[] = new int[MAX];
	private int tamanho;
	
	public Pilha() {
		this.topo = null;
	}
	
	// Inserindo na lista (push)
	public boolean push(int x, int topo) {
		No novo = new No(topo);
		
		if(topo >= (MAX-1)) {
			return false;
		} else {
			tam[topo] = x;
			return true;
		}
	}
	
	// Verificar se a lista é vazia ou não (isEmpty)
	public boolean isEmpty() {
		return this.topo == null;
	}
	
	// Verifica o tamanho da pilha (size)
	public int size() {
		return this.tamanho;
	}
	
	// Retorna o primeiro elemento da pilha (top)
	public Object top() {
		return this.topo.getElemento(MAX);
	}
	
	// Remove o elemento da Pilha (pop)
	public Object pop() {
		if(this.isEmpty()) return null;
		
		int elementoTopo = (int) this.topo.getElemento(MAX);
		//this.topo = (int) this.topo.getProximo();
		this.tamanho--;
		
		return elementoTopo;
	}
	
	//2ª QUESTÃO
	public void remove(int num) {
		Pilha elemRemovido = new Pilha();
		
		No atual = topo;
		int tam = this.tamanho;
		
		for(int i=0; i<tam; i++) {
			if(num!=atual.getElemento()) {
				elemRemovido.push(tam, i);
			}
		}
	}
	
}
