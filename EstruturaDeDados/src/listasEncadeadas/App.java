package listasEncadeadas;

public class App {
	
	public static void main(String[] args) {

		ListaEncadeada lista = new ListaEncadeada();
		lista.adicionaNoInicio("SALGUEIRO");
		System.out.println(lista);
		lista.adicionaNoInicio("CABROBO");
		System.out.println(lista);

		lista.adicionaNoFinal("PETROLINA");
		System.out.println(lista);
		
		lista.adiciona(2, "RECIFE");
		System.out.println(lista);
		
		System.out.println("Verificando a pos 1: "+lista.pega(1));
		lista.removeDoInicio();
		System.out.println(lista);
		lista.removeDoFinal();
		System.out.println(lista);

		lista.removeDoFinal();
		System.out.println(lista);
		

		lista.removeDoFinal();
		System.out.println(lista);

		//System.out.println("Início:" + lista.getInicio().getElemento() + " - Fim:" + lista.getFim().getElemento());
		
		ListaEncadeada lista3 = new ListaEncadeada();
		lista3.adicionaNoInicio(8);
		lista3.adicionaNoInicio(3);
		lista3.adicionaNoInicio(11);
		lista3.adicionaNoInicio(10);
		lista3.adicionaNoInicio(12);
		
		lista3.trocaValores(8, 12);
		System.out.println(lista3);
		
		
	}
}
