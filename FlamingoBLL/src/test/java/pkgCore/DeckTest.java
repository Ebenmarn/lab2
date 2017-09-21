package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		Deck d = new Deck(1);
		if ((52 == d.getDeck().size())== true) {
			fail(" value is" + Integer.toString(d.getDeck().size()));
		}

		Deck d1 = new Deck(6);
		if ((312 == d1.getDeck().size())== true) {
			fail("value is" + Integer.toString(d.getDeck().size()));
		}

	}
}
