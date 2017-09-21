package pkgCore;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	

	private ArrayList<Card> Deck = new ArrayList<Card>();

	public Deck(int NumDeck) {
		// the .values returns an array that contains the list of the enumeration
		// constants
		// so for each suit value we find a rank value and add it to a new card. It
		// starts from the begining of the list
		for (; NumDeck > 0; NumDeck--) {
			for (eSuit suit : eSuit.values()) {
				for (eRank rank : eRank.values()) {
					Deck.add(new Card(rank, suit));
				}
			}
		}
		Collections.shuffle(Deck);

	}

	public ArrayList<Card> getDeck() {
		return Deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		Deck = deck;
	}

	public Deck(ArrayList<Card> deck) {
		super();
		Deck = deck;
	}

	public Card Draw() {

		return Deck.remove(0);
	}
}
