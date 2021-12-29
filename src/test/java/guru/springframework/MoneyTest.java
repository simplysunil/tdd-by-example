package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	void moneyTest() {
		Doller five = new Doller(5);
        five.times(2);
        System.out.println(five.amount);
        assertEquals(4, five.amount);
	}
}
