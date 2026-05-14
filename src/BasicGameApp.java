public class BasicGameApp {
    public Card[] deck;
    public Player me;
    public Dealer d;

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
        shuffle();
        printDeck();
        me = new Player();
        d = new Dealer();
        me.printInfo();
        d.printInfo();
    }

    public void compare(){

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
