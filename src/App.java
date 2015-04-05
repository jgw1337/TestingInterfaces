import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Deck pokerDeck = new Deck();
		pokerDeck.init();
		pokerDeck.showInfo();

		ArrayList<Card> pokerCards = pokerDeck.getCards();
		StringBuilder topCard = new StringBuilder();
		topCard.append("Top card is\t: %s of %ss\n");
		System.out.printf(topCard.toString(), pokerCards.get(0).getName(),
				pokerCards.get(1).getSuit());
		pokerDeck.shuffle();
		System.out.printf(topCard.toString(), pokerCards.get(0).getName(),
				pokerCards.get(1).getSuit());
		pokerCards.get(0).showInfo();
	}

}
