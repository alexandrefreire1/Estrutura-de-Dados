import java.util.LinkedList;
import java.util.Queue;

public class App {
	public static void main(String[] args) {
		/*var fila = new FilaEstática(5);
		
		//criando a fila
		fila.enqueue("1");
		fila.enqueue("2");
		fila.enqueue("3");
		fila.enqueue("4");
		
		System.out.println(fila);
		
		//removendo elemento da fila
		fila.dequeue();
		System.out.println(fila);
		
		//imprimindo o primeiro elemento da fila
		System.out.println("Primeiro elemento da fila: "+fila.front());*/
		
		
		/*Queue<Integer> fila = new LinkedList<>(); //API Java Queue (Fila)
		
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		fila.add(5);
		fila.add(6);
		fila.add(7);
		
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila.remove());
		
		System.out.println(fila);*/
		
		
		
		FilaComPrioridade fila2 = new FilaComPrioridade(5);
		
		fila2.enqueue(1);
		fila2.enqueue(4);
		fila2.enqueue(3);
		fila2.enqueue(2);
		
		System.out.println(fila2);
		
		
		
	}
}
