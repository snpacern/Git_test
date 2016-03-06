package link2phone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DemoTest {

	@Test
	public void shouldReturnFalse() {
		Demo demo = new Demo();
		assertEquals(false, demo.getBool());
	}
	
	@Test
	public void shouldReturnTrue()
	{
		Demo demo = new Demo();
		assertTrue(demo.getBool());
	}
}
