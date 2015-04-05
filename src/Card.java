public class Card implements IInfo {
	private int value;
	private String name, suit;

	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}

	@Override
	public void showInfo() {
		System.out.println("Name\t: " + name);
		System.out.println("Suit\t: " + suit);
		System.out.println("Value\t: " + value);
	}

}
