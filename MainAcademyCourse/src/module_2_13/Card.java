package module_2_13;


public class Card {
  private Suit cardSuit;
  private Rank cardRank;

  public Card(Suit cardSuit, Rank cardRank) {
    this.cardSuit = cardSuit;
    this.cardRank = cardRank;
  }

  @Override
  public String toString() {
    return "Card {" + cardSuit.name() +
      "_" + cardRank.name() +
      '}';
  }
}
