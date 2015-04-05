import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Deck pokerDeck = new Deck();
		pokerDeck.init();
		pokerDeck.showInfo();

		ArrayList<Card> pokerCards = pokerDeck.getCards();
		System.out.println("Top card is\t: " + pokerCards.get(0).getName() + " of "
				+ pokerCards.get(1).getSuit() + "s");
		pokerDeck.shuffle();
		System.out.println("Top card is\t: " + pokerCards.get(0).getName() + " of "
				+ pokerCards.get(1).getSuit() + "s");
	}

}
