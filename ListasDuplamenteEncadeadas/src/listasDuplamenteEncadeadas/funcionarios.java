package listasDuplamenteEncadeadas;

import java.util.LinkedList;

public class funcionarios {

	public static void main(String[] args) {
		
		// 1. Questão Lista
		LinkedList<Object> funcionarios = new LinkedList<Object>();
		
		funcionarios.add("Alfredo");
		funcionarios.add("Jose");
		funcionarios.add("Zezinho");
		funcionarios.add("Eduardo");
		funcionarios.add("Rodrigo");
			
		System.out.println("LinkedList: " + funcionarios);
		
		// 2. Questão Lista
		if(funcionarios.contains("Eduardo")) {
			System.out.println("\nO elemento esta contido na lista. (" + funcionarios.get(3) + ")");
		} else {
			System.out.println("\nO elemento nao esta contido na lista.");
		}
		
		// 3. Questao Lista
		System.out.println("\nO elemento contido no indice 1 e: " + funcionarios.get(1));
		
		// 4. Questao Lista
		funcionarios.addFirst("Alexandre");
		funcionarios.removeLast();
		
		System.out.println("\nNova lista apos insercao e remocao: " + funcionarios);
		
		// 5. Questao Lista
		System.out.println("\nO primeiro elemento da lista e: " + funcionarios.element());
		System.out.println("O ultimo elemento dessa lista e: " + funcionarios.getLast());
		
		// 6. Questao Lista
		funcionarios.remove(3);
		System.out.println("\nNova lista apos a remocao: " + funcionarios);
		
		
	}
}
