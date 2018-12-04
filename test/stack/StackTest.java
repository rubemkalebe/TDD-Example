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

}
