package stack;

public class Stack {

	private Object element;
	
	private int size = 0;
	
	public boolean isEmpty() {
		return this.element == null;
	}

	public int size() {
		return this.size;
	}

	public void push(Object element) {
		this.element = element;
		size++;
	}

	public Object top() {
		return this.element;
	}

}
