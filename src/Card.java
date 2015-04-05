public class Card implements IInfo {
	private int value;
	private String name, suit;

	public enum Suits {
		CLUB, DIAMOND, HEART, SPADE
	}

	public enum Cards {
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(
				9), TEN(10), JACK(11), QUEEN(12), KING(13);
		private int cardValue;

		private Cards(int cardValue) {
			this.cardValue = cardValue;
		}

		public int getValue() {
			return cardValue;
		}

	}

	public Card(Cards name, Suits suit) {
		this.name = name.toString();
		this.suit = suit.toString();
		this.value = name.getValue();
	}

	public int getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}

	public String getName() {
		return name;
	}

	@Override
	public void showInfo() {
		System.out.println("Name\t: " + name);
		System.out.println("Suit\t: " + suit);
		System.out.println("Value\t: " + value);
	}

}
