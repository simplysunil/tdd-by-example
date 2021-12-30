package guru.springframework;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	void moneyTest() {
		Doller five = new Doller(5);
        Doller product = five.times(2);
        assertEquals(new Doller(10), product);
        product = five.times(3);
        assertEquals(new Doller(15), product);
	}
	
	@Test
	void testEquality() {
		assertEquals(new Doller(5), new Doller(5));
		assertNotEquals(new Doller(5), new Doller(8));
	}
}
