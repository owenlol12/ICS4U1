package Assignment1;

public class GetSet {
    public static void main(String[] args) {

        //creating and testing normal card
        Card card1 = new Card(Card.Suit.HEARTS, Card.Rank.ACE);

        //getting and printing the suit & rank
        System.out.println("Original Card1:");
        System.out.println(card1);
        System.out.println("Suit: " + card1.getSuit());
        System.out.println("Rank: " + card1.getRank());
        System.out.println("Joker: " + card1.getJoker()); //null bc not a joker

        //using setters to change from normal card to joker
        card1.setSuit(null); //remove bc change to joker
        card1.setRank(null);   //remove bc change joker
        card1.setJoker(Card.Joker.BIG);  //change to a joker
        System.out.println("Modified Card1:");
        System.out.println(card1);
        System.out.println("Suit: " + card1.getSuit());   //null bc is joker
        System.out.println("Rank: " + card1.getRank());   //null bc is joker
        System.out.println("Joker: " + card1.getJoker()); //should now be joker

        //creating and testing small joker
        Card card2 = new Card(Card.Joker.SMALL);

        //getting and printing the joker
        System.out.println("\nOriginal Card2 (Joker):");
        System.out.println(card2);
        System.out.println("Suit: " + card2.getSuit());   //null bc is joker
        System.out.println("Rank: " + card2.getRank());   //null bc is joker
        System.out.println("Joker: " + card2.getJoker()); //SMALL

        //using setters to change from joker to normal card
        card2.setSuit(Card.Suit.CLUBS);      //Assign Suit
        card2.setRank(Card.Rank.TEN);        //Assign Rank
        card2.setJoker(null);      //null bc change to a normal card
        System.out.println("Modified Card2:");
        System.out.println(card2);
        System.out.println("Suit: " + card2.getSuit());
        System.out.println("Rank: " + card2.getRank());
        System.out.println("Joker: " + card2.getJoker());
    }
}