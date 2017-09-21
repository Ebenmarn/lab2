package pkgCore;

import pkgEnum.*;

public class Card implements Comparable<Object> {
	private eRank eRank;
	private eSuit eSuite;

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

	}

	// Constructor
	public Card(eRank eRank, eSuit eSuite) {
		super();
		this.eRank = eRank;
		this.eSuite = eSuite;
	}

	// Getters
	public eRank geteRank() {
		return eRank;
	}

	public eSuit geteSuite() {
		return eSuite;
	}

	// Setters
	private void seteSuite(eSuit eSuite) {
		this.eSuite = eSuite;
	}

	private void setERank(eRank eRank) {
		this.eRank = eRank;
	}
}
