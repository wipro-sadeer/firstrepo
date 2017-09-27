package JUniting;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testStringConcat() {
		//fail("Not yet implemented");
		DemoClass classg = new DemoClass();
		String x = classg.stringConcat("Hello", "baby");
		assertEquals("Hellobaby", x);
	}

}
