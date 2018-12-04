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

}
