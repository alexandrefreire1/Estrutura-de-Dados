package listasDuplamenteEncadeadas;

public class ListaDuplamenteEncadeada {

	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	//Método para Validar Posição
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	//Pega o No dos Elementos
	private No pegaNo (int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	//Construtor da Lista (toString)
	
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
	
	//Verifica se a Lista está vazia e Adiciona no Inicio
	public void adicionaNoInicio(Object elemento) {
		if(this.totalDeElementos==0) {
			No novo = new No(elemento);
			this.inicio = novo;
			this.fim = novo;
		} else {
			No novo = new No(elemento, this.inicio);
			this.inicio.setAnterior(novo);
			this.inicio = novo;
		}
		totalDeElementos++;
	}

	//Verifica o último Nó e Adiciona no Fim
	public void adicionaNoFinal(Object elemento) {
		if(this.totalDeElementos==0) {
			this.adicionaNoInicio(elemento);
		} else {
			No novo = new No(elemento);
			this.fim.setProximo(novo);
			novo.setAnterior(this.fim);
			this.fim = novo;
			this.totalDeElementos++;
		}
	}
	
	//Adicionando em qualquer posição 
	public void adicionaQualquerPos(int posicao, Object elemento) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.adicionaNoInicio(elemento);
			} else if(posicao == this.totalDeElementos) {
				this.adicionaNoFinal(elemento);
			} else {
				No anterior = this.pegaNo(posicao-1);
				No proximo = anterior.getProximo();
				No novo = new No(elemento, proximo);
				anterior.setProximo(novo);
				proximo.setAnterior(novo);
				novo.setAnterior(anterior);
				
				this.totalDeElementos++;
			}
		} else if(posicao == this.totalDeElementos) {
			this.adicionaNoFinal(elemento);
		} else {
			System.out.println("Posição Inválida.");
		}
	}
	
	//Removendo do Início
	public void removeDoInicio() {
		if(this.totalDeElementos > 1) {
			No novoInicio = this.inicio.getProximo();
			novoInicio.setAnterior(null);
			this.inicio = this.inicio.getProximo();
		} else {
			this.fim = null;
			this.inicio = null;
		}
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.fim = null;
		}
	}
	
	//Removendo do Fim
	public void removeDoFinal() {
		if(this.totalDeElementos > 1) {
			No novoFim = this.fim.getAnterior();
			this.fim.setProximo(null);
			this.fim = novoFim;
			
			this.totalDeElementos--;
		} else {
			this.fim = null;
			this.inicio = null;
		}
	}
	
	//Removendo de qualquer posição
	public void removeQualquerPos(int posicao) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.removeDoInicio();
			}
			else if(posicao == this.totalDeElementos-1) {
				this.removeDoFinal();
			} else {
			
			No no = this.pegaNo(posicao);
			No anterior = no.getAnterior();
			No proximo = no.getProximo();
			
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			}
		} else {
			System.out.println("Posição Inválida!");
		}
	}
	
	//Remover o maior e o menor elemento da lista
	public void removeMaiorMenor() {
		int maiorElem = 0;
		int menorElem = 0;
		int pos = 0;
		int posMenor = 0;
		
		No atual = this.inicio;
		
		for(int i=0; i < this.totalDeElementos; i++) {
			if(i==0) {
				maiorElem = (int) atual.getElemento();
				menorElem = (int) atual.getElemento();
			} else if ((int) atual.getElemento() > maiorElem) {
				maiorElem = (int) atual.getElemento();
				pos = i;
			} else if ((int)atual.getElemento() < menorElem) {
				menorElem = (int) atual.getElemento();
				posMenor = i;
			}
			atual = atual.getProximo();
		}
		this.removeQualquerPos(pos);
		if(this.totalDeElementos == 2) {
			posMenor-=1;
		}
		this.removeQualquerPos(posMenor);
	}
	
	//Procura um elemento sem ser pelo índice
	public void procurar(Object elemento) {
        if (elemento != null) {
            No inicio = this.getInicio();
            No fim = this.getFim();

            while (!inicio.equals(fim) && !inicio.getProximo().equals(fim) && !inicio.getElemento().equals(elemento) && 
            		!fim.getElemento().equals(elemento)) {
                inicio = inicio.getProximo();
                fim = fim.getAnterior();
            }

            if (inicio.getElemento().equals(elemento) || fim.getElemento().equals(elemento)) {
                System.out.println("Elemento encontrado: " + elemento);
            } else {
            	System.out.println("Não encontrado.");
            }
        }
    }
	// Avaliação 2
	
	// Questão 1
	public void encontraNesimo(int n) {
		No atual = this.inicio;
		
		int pos = 0;
		int nEsimoMaior = 0;
		
		for(int i=0; i < this.totalDeElementos; i++) {
			if(i==0) {
				nEsimoMaior = (int) atual.getElemento();
			} else if ((int) atual.getElemento() > n) {
				nEsimoMaior = (int) atual.getElemento();
				pos = i;
			}
			atual = atual.getProximo();
		}
		System.out.println(nEsimoMaior);
		System.out.println(pos);
	}
	
	// Correção Questão 1
	
	
	
	
	// Questão 2
	public void divideLista(int n) {
		No atual = this.getInicio();
		
		ListaDuplamenteEncadeada novaLista = new ListaDuplamenteEncadeada();
		int dividir = this.getTotalDeElementos() / n;
		
		for(int i=0; i < n; i++) {
			ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
			for(int j=0; j < dividir; j++) {
				lista.adicionaNoFinal(atual.getElemento());
				atual = atual.getProximo();
			}
			novaLista.adicionaNoFinal(lista);
		}
		System.out.println(novaLista);
	}
	
	//Gets e Sets
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
	public int getTotalDeElementos() {
		return totalDeElementos;
	}
	public void setTotalDeElementos(int totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}
	
}
