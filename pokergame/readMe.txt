/************************************************
* readMe.txt for poker game
* @author RTadepalli
************************************************/

HOW TO RUN

From the command line:
$ javac *.java
$ java PokergameApplication

DESCRIPTION

Card class:
Creates a playing card. I use constants to refer to the suits
and face cards. The instance variables are the ints rank and
suit. Besides accessor and toString methods, there is a compareTo
method, since Card implements Comparable.

Deck class:
This class creates a deck of playing cards, as an array of Card objects.
The instance variables are an array of Cards and an int
representing the current top card in the deck. There is a shuffle
method that switches the Cards in the deck several hundred times,
which gets the deck well-shuffled. There is also a toString method
for a full deck. The getCard method gives a Player a Card by returning
the top card of the Deck and also incrementing the topcard int by 1 each
time a card is given.

Player class:
This class creates a Player object. The instance variables are an array of
five Cards, which is the Player's hand,  and an instance of a Deck.
After the Deck is shuffled and five Cards are dealt, the hand can be sorted.
Then there are methods to evaluate the hand to see if it fits
the criteria for particular poker hands.

Game class:
This class puts all the methods and objects from the above classes
together to actually create a game of video poker.
It gives a Player a Hand, and then allows them to redraw Cards if they wish.
Their new hand is evaluated and the best poker hand that can be formed from
that hand is displayed. Then the user can play again.
Once the user no longer wants to play, they are thanked for playing and
the program terminates.

PokergameApplication class:
Contains a main method to create a new Game, and then executes the
play method within the Game class.

UserPlayGame class:
This extra class was created to allow a user to test whether hard-coded hands of
cards would be evaluated properly. That way, the user does not have to wait until,
for example, a royal flush hand is randomly drawn.
The user can manipulate the code in order to change the cards in the player's hand
and change which method is being tested.
First the user should specify which cards are in the hand, by
entering values for the ranks and suits of Cards c1 to c5.
There is blank space where the user is expected to copy and paste
segments of code from the Player class in order to test each of the hand
evaluator methods.
There is an outprint line where the user should enter the name of the boolean
for that particular hand of cards. When they run HardCodeTester, that boolean
will be printed so the user can see whether or not the evaluator method worked.

PokerGameController class:
This class for web pages controller to manage the web UI access for the user. Thymleaf template engine has been
used for webpage rendering which is light weight template pages for html UI presentation.