package dcll.vlaf.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack implements SimpleStack{

	public Stack<Item> pile;
		
	
	@Override
	public boolean isEmpty() {
		return pile.isEmpty();
	}

	@Override
	public int getSize() {
		return pile.size();
	}

	@Override
	public void push(Item item) {
		pile.push(item);		
	}

	@Override
	public Item peek() throws EmptyStackException {
		return pile.peek();
	}

	@Override
	public Item pop() throws EmptyStackException {
		return pile.pop();
	}

}
