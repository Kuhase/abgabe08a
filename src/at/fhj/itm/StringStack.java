package at.fhj.itm;

import java.util.ArrayList;
import java.util.List;

/**
 * Stack Implementation of <code>Stack</code> Interface.
 * supports String Values and can be initialized with a maximum number
 * of items.
 *  
 * @see Stack
 */
public class StringStack implements Stack {

	List<String> stack = new ArrayList<String>();

	private int stackMax = 10; //begrenzt Anzahl der Elemente in Liste/im Stack auf 10.

	//zeigt an, ob Stack leer ist
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	//wenn Platz in Stack ist, wird ein Element hinzugefügt
	@Override
	public void push(String item) {
		if(stack.size() < stackMax){
			stack.add(item);
		} else{
			System.out.println("Die Stack ist voll!");
		}
	}

	//löscht oberstes Element aus Stack
	@Override
	public String pop() {
		if(stack.isEmpty() == false){
			String tmp = stack.get(stack.size()-1); //Zwischenspeichern des letzten Elements
			stack.remove(stack.size()-1);
			return tmp;
		} else{
			return "Stack beinhaltet kein Element!";
		}
	}

}
