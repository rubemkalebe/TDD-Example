package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void emptyStackTest() {
		Stack s = new Stack();
		assertTrue(s.isEmpty());
		assertEquals(0, s.size());
	}
	
	@Test
	public void pushOneElementTest() {
		Stack s = new Stack();
		s.push("first");
		assertFalse(s.isEmpty());
		assertEquals(1, s.size());
		assertEquals("first", s.top());
	}
	
	@Test
	public void pushAndPopTest() {
		Stack s = new Stack();
		s.push("first");
		s.push("second");
		assertEquals(2, s.size());
		assertEquals("second", s.top());
		
		Object element = s.pop();
		assertEquals(1, s.size());
		assertEquals("first", s.top());
		assertEquals("second", element);
	}
	
	@Test(expected = EmptyStackException.class)
	public void popEmptyStackTest() {
		Stack s = new Stack();
		s.pop();
	}
	
	@Test
	public void pushFullStackTest() {
		Stack s = new Stack();
		for(int i = 1; i <= 10; i++) {
			s.push("Element " + i);
		}
		
		try {
			s.push("Element 11");
			fail();
		} catch(FullStackException e) {	}
	}

}
