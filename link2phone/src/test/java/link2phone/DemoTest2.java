package link2phone;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DemoTest2 {

	@Test
	public void shouldReturnFalse() {
		Demo demo = new Demo();
		assertEquals(false, demo.getBool());
	}
}
