package listasDuplamenteEncadeadas;

public class App {
	
	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		lista.adicionaNoFinal(1);
		lista.adicionaNoFinal(2);
		lista.adicionaNoFinal(3);
		lista.adicionaNoFinal(4);
		lista.adicionaNoFinal(5);
		lista.adicionaNoFinal(6);
		lista.adicionaNoFinal(7);
		lista.adicionaNoFinal(8);
		lista.adicionaNoFinal(9);
		lista.adicionaNoFinal(10);
		lista.adicionaNoFinal(11);
		lista.adicionaNoFinal(12);
		
		System.out.println(lista);
		
		lista.encontraNesimo(5);
		lista.divideLista(4);
		
		
	}
}
