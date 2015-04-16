public class DeckOfCards {

	private Card[] deckOfCards;
	public static final int NCARDS = 52;
	private int current;

	private static class Card {

		private int suit;
		private int rank;
		private static final int DIAMOND = 0;
		private static final int HEART = 1;
		private static final int SPADE = 2;
		private static final int CLUB = 3;

		private Card(int suit, int rank) {
			this.suit = suit;
			this.rank = rank;
		}

		public String toString() {
			StringBuilder s = new StringBuilder();
			s.append(suit);
			s.append(rank);
			s.append(" ");
			return s.toString();
		}
	}

	public DeckOfCards() {
		deckOfCards = new Card[NCARDS];
		int k = 0;
		for (int suit = Card.DIAMOND; suit <= Card.CLUB; suit++) {
			for (int rank = 0; rank <= NCARDS / 4; rank++) {
				deckOfCards[k++] = new Card(suit, rank);
			}
		}
		current = 0;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(" ");
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				s.append(deckOfCards[k++]);
				s.append(" ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public Card deal() {
		if (current > 52)
			throw new RuntimeException("No cards anymore.");
		return deckOfCards[current++];
	}

	public void shuffle() {
		for (int k = 0; k < NCARDS; k++) {
			int i = (int) (NCARDS * Math.random());
			int j = (int) (NCARDS * Math.random());
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[j];
			deckOfCards[j] = temp;
		}
		current = 0;
	}

	public static void main(String[] args) {
		// test client
	}
}