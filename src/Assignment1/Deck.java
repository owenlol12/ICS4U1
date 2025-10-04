package Assignment1;
import java.util.*;
import Assignment1.Card.Rank;
import Assignment1.Card.Suit;
import Assignment1.Card.Joker;

public class Deck {
    private ArrayList <Card> cardDeck;
    
    //constructor
    public Deck(boolean hasJoker){
        cardDeck = new ArrayList<>();
        fillDeck();
    
        if (hasJoker){
            cardDeck.add(new Card(Joker.BIG));
            cardDeck.add(new Card(Joker.SMALL));
        }
    }

    //method to fill deck with all stardard cards
    public void fillDeck(){
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cardDeck.add(new Card(suit, rank));
            }
        }
    }
    
    //method to add any card
    public void addCard(Card Cd){
        cardDeck.add(Cd);
    }

    //method to shuffle the deck
    public void shuffle(){
        Collections.shuffle(cardDeck);
    }

    //method to deal a card
    public Card dealCard(){
        if (cardDeck.isEmpty()) return null;
        return cardDeck.remove(0);
    }

    //method to check if the deck is empty
    public boolean isEmpty(){
        return cardDeck.isEmpty();
    }

    //method to check deck size
    public int size() {
        return cardDeck.size();
    }
}
    