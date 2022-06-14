/* The BlackjackHand class from Subsection 5.5.1 is an extension of the Hand class from Sec- (solution) tion 5.4. 
The instance methods in the Hand class are discussed in that section. 
In addition to those methods, BlackjackHand includes an instance method, getBlackjackValue(), which returns the value of the hand for the game of Blackjack. 
For this exercise, you will also need the Deck and Card classes from Section 5.4. A Blackjack hand typically contains from two to six cards. Write a program to test the BlackjackHand class. 
You should create a BlackjackHand object and a Deck object. Pick a random number between 2 and 6. Deal that many cards from the deck and add them to the hand. 
Print out all the cards in the hand, and then print out the value computed for the hand by getBlackjackValue(). Repeat this as long as the user wants to continue. 
In addition to TextIO.java, your program will depend on Card.java, Deck.java, Hand.java, and BlackjackHand.java.
 */

 public class Blackjack
 {
       public static void main(String[] args) 
       {
              Deck deck = new Deck();
              Card card;
              BlackjackHand hand;
              int cardCount;
              String restart;
       
              do 
              {
                     deck.shuffle();
                     hand = new BlackjackHand(); 
                     cardCount = 2 + (int)(Math.random()*5);

                     System.out.println("Cards in hand: ");

                     for (int i = 1; i <= cardCount; ++i) 
                     {
                            card = deck.dealCard();
                            hand.addCard(card);
                            System.out.println("- " + card);
                     }

                     if(hand.getBlackjackValue() == 21)
                     {
                            System.out.println("Blackjack!");
                     }
                     else
                     {
                            System.out.println("Value of hand: " + hand.getBlackjackValue());
                     }
                     System.out.println();
                     System.out.print("Try again? Y/N");
                     
                     restart = TextIO.getlnString();
              } while (restart == "Y" || restart == "y");
       }
 }