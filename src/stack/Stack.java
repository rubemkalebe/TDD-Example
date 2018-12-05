package stack;

public class Stack {

	private Object[] elements = new Object[10];
	
	private int size = 0;
	
	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size() {
		return this.size;
	}

	public void push(Object element) {
		if(this.size == elements.length) {
			throw new FullStackException();
		}
		this.elements[this.size] = element;
		this.size++;
	}

	public Object top() {
		return this.elements[this.size-1];
	}

	public Object pop() {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		
		Object element = this.top();
		this.size--;
		return element;
	}

}
