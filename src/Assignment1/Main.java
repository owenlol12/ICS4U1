package Assignment1;
import java.util.*;
import Assignment1.Card;
import Assignment1.Card.Suit;
import Assignment1.Card.Rank;
import Assignment1.Card.Joker;
import Assignment1.Deck;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //create deck
        System.out.println("If Deck Has Jokers Type Y, If Not Type N"); 
        char joke = scan.nextLine().charAt(0);
        Deck deck;
        if (joke == 'Y'){
            deck = new Deck(true);
        }
        else if (joke == 'N'){
            deck = new Deck(false);
         }
        else{
            System.out.println("Invalid Input");
        }
        
        

        //shuffle the deck
        deck.shuffle();

        //print deck size
        System.out.println("Deck size: " + deck.size());

        //deal two cards
        Card d1 = deck.dealCard();
        Card d2 = deck.dealCard();
        
        //prints those cards
        System.out.println("Cards Dealt:");
        System.out.println(d1);
        System.out.println(d2);

        //checdk if deck is empty
        if (deck.isEmpty()){
        System.out.println("Deck is Empty");
        }
        else{
        System.out.println("Deck is not Empty"); 
        System.out.println("Remaining Cards: "); 
        for (Card card : deck){

        }
        }
        
        }
    }