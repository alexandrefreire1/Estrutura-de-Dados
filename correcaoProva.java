package prova1;

public class correcaoProva {
	
	private int tamanho;
	private String elemento;
	private Object[] elementos;

	// 1. Crie uma opera��o na Lista, para isso, adicione um novo m�todo. 
	//    A nova opera��o deve limpar a lista, ou seja, remover todos os elementos.
	
	public void limpa() {
		this.tamanho = 0;
	}
	
	// 2. Implemente mais uma opera��o na Lista, adicionando um novo m�todo. 
	//    A nova opera��o deve procurar o �ndice da �ltima ocorr�ncia de um elemento 
	//    passado como par�metro.
	
	public int retornaIndice(String elemento) {
		int indice = -1;
		for(int i=0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				indice = i;
			}
		}
		return indice;
	}
	
	// 3. Acrescente uma opera��o na classe Vetor, implemente um novo m�todo. 
	//    A nova opera��o deve remover da Lista todas as ocorr�ncias de um elemento 
	//    que � passado com par�metro. N�o esque�a de rearranjar os elementos do vetor 
	//    ap�s a remo��o.
	
	public void removeOcorrencias(String elemento) {
		for(int i=0; i < this.tamanho; i++) {
			//if(this.elemento[i].equals(elemento)) {
				
			}
		}
	}

