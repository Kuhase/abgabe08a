package at.fhj.itm;

public class Testen {

	public static void main(String[] args) {
		
		//Stack anlegen
		StringStack stack = new StringStack();
		
		//Stack bef�llen
		stack.push("Deadpool");
		stack.push("Spiderman");
		stack.push("Quicksilver");
		stack.push("Iron Man");
		stack.push("Thor");
		stack.push("Vision");
		stack.push("Antman");
		stack.push("Hulk");
		
		//Elemente l�schen
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	
		
		
		
	}

}
