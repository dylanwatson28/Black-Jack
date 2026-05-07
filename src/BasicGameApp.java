public class BasicGameApp {
    public Card[] deck;
    public Player me;
    public Dealer D;

    public static void main(String[] args) {
        new BasicGameApp();

    }
    public BasicGameApp(){
        System.out.println("welcome to BlackJack!");

        deck = new Card[52];
        for(int x = 0; x<13; x++){
            deck[x] = new Card("hearts", 10, x);
            deck[x].printInfo();
        }
    }

    public void compare(){

    }
    public void round(){

    }
    public void shuffle(){



    }
}
