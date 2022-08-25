
public class Filas {
	//Inserção no Final, Remoção no Início (FIFO)
	
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	// Construtor
	public Filas() {
		totalDeElementos = 0;
		this.inicio = null;
		this.fim = null;
	}
	
	// toString - Construtor da Fila
	@Override
	public String toString() {
		if(this.totalDeElementos==0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No atual = this.inicio;
		for(int i=0; i<this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		
		//builder.append("\nInicio: " + this.inicio.getElemento());
		//builder.append("\nFim: " + this.fim.getElemento());
		return builder.toString();
	}
	
	//ENFILEIRAR
	public void enqueue(Object elemento) {
		No novo = new No(elemento);
		if(this.isEmpty()) {
			this.inicio = novo;
		} else {
			this.fim.setProximo(novo);
		}
		this.fim = novo;
		this.totalDeElementos++;
	}
	
	//DESENFILEIRAR (REMOVER)
	public void dequeue() {
		if(!isEmpty()) {
			this.inicio = this.inicio.getProximo();
			this.totalDeElementos--;
			if(this.totalDeElementos == 0) {
				this.fim = null;
			}
		}
	}
	
	//VERIFICA SE A LISTA ETSÁ VAZIA
	public boolean isEmpty() {
		return this.totalDeElementos==0;
	}
	
	//VERIFICA O TAMANHO DA LISTA
	public int size() {
		return this.totalDeElementos;
	}
	
	//RETORNA O PRIMEIRO ELEMENTO DA LISTA
	public Object front() {
		return this.inicio.getElemento();
	}
	
	// Getters and Setters
	public No getInicio() {
		return inicio;
	}
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getFim() {
		return fim;
	}
	public void setFim(No fim) {
		this.fim = fim;
	}
	public int getTamanho() {
		return totalDeElementos;
	}
	public void setTamanho(int tamanho) {
		this.totalDeElementos = tamanho;
	}
	
	
}