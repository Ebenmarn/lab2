package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Hand() {

	}

	public int[] ScoreHand() {
		int[] iScore = new int[2];

		iScore[0] = 0;
		iScore[1] = 0;

		Collections.sort(cards);

		for (Card c : cards) {

			switch (c.geteRank().getiRankNbr()) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				iScore[0] += c.geteRank().getiRankNbr();
				iScore[1] += c.geteRank().getiRankNbr();
				break;
			case 10:
			case 11:
			case 12:
			case 13:
				iScore[0] += 10;
				iScore[1] += 10;
				break;
			case 14:
				iScore[0] +=  1;
				iScore[1] +=  11;

				break;

			}
		}
		return iScore;
	}

	public void Draw(Deck d) {
		cards.add(d.Draw());
	}

	private void AddCard(Card c) {
		cards.add(c);
	}

}
