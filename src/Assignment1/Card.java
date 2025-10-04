package Assignment1;
public class Card {
    private Suit suit;
    private Rank rank;
    private Joker joker;

    //private enums for suit and rank
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public enum Joker {
        SMALL, BIG
    }

    //constructor for normal cards
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.joker = null;
    }
    

    // constructor for joker
    public Card(Joker joker) { 
    this.suit = null;
    this.rank = null;
    this.joker = joker;
    }     
    
    //getters
    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    public Joker getJoker() {
        return joker;
    }

    //setters
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    public void setJoker(Joker joker) {
        this.joker = joker;
    }

    @Override

    //method to convert to string
    public String toString() {
        if (joker != null){
            return joker.name() + " JOKER";
        }
        else{
        return rank + " OF " + suit;
        }
    }
}

