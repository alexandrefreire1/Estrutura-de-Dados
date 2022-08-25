
public class FilaEstática {
	private Object elementos[];
	private int tamanho;
	
	public FilaEstática(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	//VERIFICA O TAMANHO
	public int size() {
		return this.tamanho;
	}
	
	//VERIFICA SE ESTÁ VAZIO
	public boolean isEmpty() {
		return this.tamanho==0;
	}
	
	//INSERIR
	public boolean enqueue(Object elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	//REMOVER
	public String dequeue() {
		if(this.isEmpty()) {
			return null;
		}
		int inicio = 0;
		for(int i=inicio; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
		return("Elemento removido.");
	}
	
	//VERIFICAR O PRIMEIRO ELEMENTO
	public Object front() {
		return this.elementos[0];
	}

	//MÉTODO PARA IMPRIMIR A FILA - toString
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("[");
		for(int i = 0; i<this.tamanho-1; i++) {
			string.append(this.elementos[i]);
			string.append(", ");
		}
		if(tamanho>0) {
			string.append(this.elementos[this.tamanho-1]);
		}
		string.append("]");
		
		return string.toString();
	}
	
}
