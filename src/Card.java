public class Card implements IInfo {
	private int value;
	private String name, suit;

	public static final String[] LIST_OF_SUITS = {"Club", "Diamond", "Heart", "Spade"};
	public static final String[] LIST_OF_CARDS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	public static final int[] LIST_OF_CARD_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	

	public Card(String name, String suit) {
		this.name = name;
		this.suit = suit;
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
