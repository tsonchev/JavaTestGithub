import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class RandomHandsofCards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			drawHands();
		}

	}

	private static void drawHands() {
		Card[] deckCards = Card.createDeck();
		Random randomHand = new Random();
		HashSet<Integer> handSignature = new HashSet<>();
		Integer randomCard;

		for (int i = 0; i < 5; i++) {
			do {
				randomCard = randomHand.nextInt(deckCards.length);
				handSignature.add(randomCard);
			} while (handSignature.size() < i + 1);
		}

		for (Integer index : handSignature) {
			System.out.print(deckCards[index].toString() + "");
		}
		System.out.println();

	}

}
