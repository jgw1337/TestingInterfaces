import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck implements IInfo {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int cardCounter = 0;

	public void init() {
		for (String cardSuit : Card.LIST_OF_SUITS) {
			for (String cardName : Card.LIST_OF_CARDS) {
				cardCounter++;
				cards.add(new Card(cardName, cardSuit));

			}

		}
		System.out.println("This deck has " + cardCounter + " cards.");
	}

	public void shuffle() {
		long seed = System.nanoTime();
		int shuffleCounter = 7;
		for (int i = 0; i < shuffleCounter; i++) {
			Collections.shuffle(cards, new Random(seed));
		}
		System.out.println("This deck has been shuffled " + shuffleCounter + " times.");
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	@Override
	public void showInfo() {
		System.out.println("Number of cards\t: " + cards.size());

	}
}
