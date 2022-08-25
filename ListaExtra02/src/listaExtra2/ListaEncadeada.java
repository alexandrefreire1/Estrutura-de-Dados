package listaExtra2;

import java.util.Scanner;

public class ListaEncadeada {

	private No inicio;
	private No fim;
	private int totalDeElementos;

	//1ª Questão
	
	//Construtor da Lista (toString)
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		} else {
			StringBuilder builder = new StringBuilder("");
			No atual = this.inicio;
			for (int i = 0; i < this.totalDeElementos - 1; i++) {
				builder.append("Contato: ");
				builder.append(atual.getContato().getNome());
				builder.append("\nTelefone: ");
				builder.append(atual.getContato().getTelefone());
				builder.append("\nEmail: ");
				builder.append(atual.getContato().getEmail());
				builder.append("\nData de Nascimento: ");
				builder.append(atual.getContato().getDataNasc());
				builder.append("\n ");
				atual = atual.getProximo();
			}
			builder.append("\nContato: ");
			builder.append(atual.getContato().getNome());
			builder.append("\nTelefone: ");
			builder.append(atual.getContato().getTelefone());
			builder.append("\nEmail: ");
			builder.append(atual.getContato().getEmail());
			builder.append("\nData de Nascimento: ");
			builder.append(atual.getContato().getDataNasc());
			builder.append("");
			return builder.toString();
		}
	}
	
	//Validando posição do Contato
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	//Pegando nó e validando posição
	private No pegaNo(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		No atual = this.inicio;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	//Criando Lista Vazia
		public static ListaEncadeada criaAgenda() {
			ListaEncadeada listaVazia = new ListaEncadeada();
			return listaVazia;
		}
	
	//Insere Contato na Agenda
		public void insereContato(Contato contato) {
			if(this.totalDeElementos == 0) {
				this.adicionaNoInicio(contato);
			} else if(this.inicio.getContato().getNome().equalsIgnoreCase(contato.getNome()) || this.fim.getContato().getNome().equalsIgnoreCase(contato.getNome())){
				System.out.println("Não é possível inserir um contato existente.");
			} else {
				this.adicionaNoInicio(contato);
			}
		}
		
		//Adiconando Contato no Inicio
		public void adicionaNoInicio(Contato contato) {
			No novo = new No(contato, this.inicio);
			this.inicio = novo;
			if(this.totalDeElementos==0) {
				this.fim = novo;
			}
			this.totalDeElementos++;
		}
		
		//Adicionando Contato no Final
		public void adicionaNoFinal(Contato contato) {
			if(this.totalDeElementos==0) {
				this.adicionaNoInicio(contato);
			}else {
				No novo = new No(contato);
				this.fim.setProximo(novo);
				this.fim = novo;
				this.totalDeElementos++;
			}
		}
		
		//Buscando contato na Agenda
		public String buscaContato(String nome) {
			No atual = this.inicio;
			int pos = 0;
			
			for(int i = 0; i < this.totalDeElementos; i++) {
				if(atual.getContato().getNome().equals(nome)) {
					pos = i;
					No encontrado = this.pegaNo(pos);
					
					System.out.println("\n");
					System.out.println("Contato: " + encontrado.getContato().getNome());
					System.out.println("Telefone: " + encontrado.getContato().getTelefone());
					System.out.println("Email: " + encontrado.getContato().getEmail());
					System.out.println("Data de Nascimento: " + encontrado.getContato().getDataNasc());
					return "Posição: " + pos;
				} else {
					System.out.println("Contato não existe");
				}
				atual = atual.getProximo();
			}
			return "";
		}
		
		//Removendo contato da Agenda
		public void removeContato(String nome) {
			No atual = this.inicio;
			No fim = this.fim;
			int posicao = 0;
			for(int i = 0; i < this.totalDeElementos; i++) {
				if(this.totalDeElementos ==0) {
					System.out.println("Não existe nenhum contato na agenda");
				}
				else if(atual.getContato().getNome().equals(nome)) {
					posicao = i;
					this.removerQualquerPos(posicao);
				}else {
					System.out.println("Contato não existe na agenda");
				}
				atual = atual.getProximo();
				
			}
		}
		
		//Métodos referentes a remoção do contato
		public Contato pegarContato(String nome) {
			No atual = this.inicio;
			Contato contato = null;
			for(int i = 0; i < this.totalDeElementos; i++) {
				if(atual.getContato().getNome().equals(nome)) {
					contato = atual.getContato();
				}
			}
			return contato;
		}
		
		public void removeInicio() {
			this.inicio = this.inicio.getProximo();
			this.totalDeElementos--;
			if (this.totalDeElementos == 0) {
				this.fim = null;
			}
		}
		public void removeFinal() throws IllegalArgumentException {
			if (this.totalDeElementos == 0) {
				System.out.println("Lista Vazia!");
			} else if (this.totalDeElementos == 1) {
				this.removeInicio();
			} else {
				No anterior = this.pegaNo(this.totalDeElementos-2);
				anterior.setProximo(null);
				this.fim = anterior;
				this.totalDeElementos--;
			}
		}
		private void removerQualquerPos(int posicao) {
			if(this.posicaoValida(posicao)) {
				if(posicao==0) {
					this.removeInicio();
				}else if(posicao ==this.totalDeElementos-1) {
					this.removeFinal();
				}else {
					No anterior = this.pegaNo(posicao-1);
					No atual = anterior.getProximo();
					anterior.setProximo(atual.getProximo());;
					this.totalDeElementos--;
				}
			} else {
				System.out.println("Posição não existe. Tente novamente.");
			}
		}
		
		//Atualizando um contato existente
		public void atualizaContato(Contato contato) {
			this.buscaContato(contato.getNome());
			Scanner scan = new Scanner(System.in);
			System.out.println("Editar nome: ");
			String novoNome = scan.nextLine();
			
			System.out.println("Editar telefone: ");
			String novoTel = scan.nextLine();
			
			System.out.println("Editar email: ");
			String novoEmail = scan.nextLine();
			
			contato.setNome(novoNome);
			contato.setTelefone(novoTel);
			contato.setEmail(novoEmail);
			
			System.out.println("Contato Atualizado.");
		}
		
		//Menu de Seleção
		public String menu() {
			Scanner scan = new Scanner(System.in);
			int opcao;
			return " (1) Criar Novo Contato\n" + 
					"(2) Listar Contatos Salvos\n" + 
					"(3) Buscar Contato\n" + 
					"(4) Atualizar Contato Existente\n" +
					"(5) Remover Contato\n" +
					"(6) Sair\n";
		}
		
		//2ª Questão
		public void inverteDirecao() {
	        No anterior = null;
	        No proximo;
	        No atual = inicio;

	        while (atual != null) {
	            proximo = atual.getProximo();
	            atual.setProximo(anterior);
	            anterior = atual;
	            atual = proximo;
	        }
	        inicio = anterior;
	    }	
}
