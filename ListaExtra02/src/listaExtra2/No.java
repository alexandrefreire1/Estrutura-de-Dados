package listaExtra2;

public class No {

	private Contato contato;
	private No proximo;
	
	public No(Contato contato, No proximo) {
		super();
		this.contato = contato;
		this.proximo = proximo;
	}
	
	public No(Contato contato) {
		this.contato = contato;
	}
	
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
}
