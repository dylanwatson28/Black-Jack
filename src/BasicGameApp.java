import java.util.Scanner;
public class BasicGameApp {
    public Card[] deck;
    public Player me;
    public Dealer d;
    public int bet;
    public int deckPosition;
    public int playerTurn;

    public static void main(String[] args) {
        new BasicGameApp();

    }

    public BasicGameApp() {
        System.out.println("welcome to BlackJack!");
        deck = new Card[52];
        int counter = 0;

        for (int y = 0; y < 4; y++) {

            for (int x = 0; x < 13; x++) {
                deck[counter] = new Card(y, 10, x);
                counter++;
                //  deck[x].printInfo();d
            }
        }

        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.println(name);
        me = new Player();
        d = new Dealer();
        boolean playing = true;
        while (playing) {
            me.hand = new Card[10];
            d.hand = new Card[10];
            shuffle();
            deckPosition = 0;
            //deal starting cards
            me.hit(deck[deckPosition++]);
            d.hit(deck[deckPosition++]);
            me.calculateTotal();
            d.calculateTotal();
            System.out.println("your total: " + me.total);
            System.out.println("Dealer total: " + d.total);
            //player turn
            boolean playerTurn = true;
        }
        while (playerTurn) {
            System.out.println("Hit or stand?");
            String hit = s.nextLine();
            if (hit.equalsIgnoreCase("hit")) {
                me.hit(deck[deckPosition++]);
                me.calculateTotal();
                System.out.println("your total: " + me.total);
                if (me.total > 21) {
                    System.out.println("Bust!");
                    playerTurn = false;
                }
                //Dealer turn
                while (d.total < 17) {
                    d.hit(deck[deckPosition++]);
                    d.calculateTotal();
                }
                compare();
                System.out.println("Play again?");
                String again = s.nextLine();
                if (!again.equalsIgnoreCase("yes")) {
                    playing = false;
                }
            }
        }

    }

    public void compare(){
        System.out.println("Your total: " + me.total);
        System.out.println("Dealer total: " + d.total);
        if (me.total > 21) {
            System.out.println("Dealer wins!");
        }
        else if (d.total > 21) {
            System.out.println("You win!");
        }
        else if (me.total > d.total) {
            System.out.println("You win!");
        }
        else if (d.total > me.total) {
            System.out.println("Dealer wins!");
        }
        else {
            System.out.println("Push!");
        }
    }

    public void round(){

    }
    public void shuffle(){
        for (int x = 0; x < deck.length; x++){
            int randomIndex = (int)(Math.random() * 52);
            //range 0 - 51
            //want to exclude 52 because array starts at 0
            Card spencer = deck[randomIndex];
            deck [randomIndex] = deck[x];
            deck[x] = spencer;
            //shuffled deck
        }



    }
    public void printDeck(){
        for (int x = 0; x < deck.length; x++){
            deck[x].printInfo();
        }
    }
}
