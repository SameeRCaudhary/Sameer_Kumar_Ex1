package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Sameer Kumar
 * @author Sameer Kumar Jan 25, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(card.randomV());
            card.setSuit(Card.SUITS[card.randomS()]);
            hand[i] = card;
        }
         Card userCard = new Card();
        int value;
        String suit;
        boolean found = false;
        System.out.print("Enter the value of the card(1-13): ");
        value = scan.nextInt();
        System.out.print("Enter the suit of the card" + Arrays.toString(Card.SUITS) + ": ");
        suit = scan.next();
        userCard.setValue(value);
        userCard.setSuit(suit);
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        if (found)
           printInfo();
        else
            System.out.println("OOps your card not found in magicHand");

        
    }

    
     /* @author Sameer Kumar Jan 2023 */
    private static void printInfo() {
    
        // I am Done
        System.out.println("Congratulations, you guessed right!");
        System.out.println("Changes made in the github");

        
    
    }

}
