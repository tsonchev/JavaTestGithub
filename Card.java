import java.util.ArrayList;

public class Card {
	public enum CardSuits {
		Clubs("в™Ј"), Hearts("в™Ґ"), Diamonds("в™¦"), Spades("в™ ");
		private final String suitSymbol;

		private CardSuits(String symbol) {
			suitSymbol = symbol;
		}

		public String getSuitSymbol() {
			return suitSymbol;
		}

	}

	public enum CardFaces {
		Face_2("2"), Face_3("3"), Face_4("4"), Face_5("5"), Face_6("6"), Face_7(
				"7"), Face_8("8"), Face_9("9"), Face_10("10"), Face_j("J"), Face_Q(
				"Q"), Face_K("K"), Face_A("A");
		private final String faceSymbol;

		private CardFaces(String symbol) {
			faceSymbol = symbol;
		}

		public String getFaceSymbol() {
			return faceSymbol;
		}

	}

	CardFaces cardFace;
	CardSuits cardSuits;

	public String getFaceString() {
		return cardFace.getFaceSymbol();
	}

	public String getSuitString() {
		return cardSuits.getSuitSymbol();
	}

	public Card(CardFaces face, CardSuits suits) {
		cardFace = face;
		cardSuits = suits;
	}

	public String toString() {
		return cardFace.getFaceSymbol() + cardSuits.getSuitSymbol();
	}

	public static Card[] createDeck() {
		Card[] result;
		CardFaces[] faces = CardFaces.values();
		CardSuits[] suits = CardSuits.values();
		ArrayList<Card> deck = new ArrayList<>();
		for (int i = 0; i < faces.length; i++) {
			for (int k = 0; k < suits.length; k++) {
				deck.add(new Card(faces[i], suits[k]));

			}
		}
		result = new Card[deck.size()];
		return deck.toArray(result);
	}
}
