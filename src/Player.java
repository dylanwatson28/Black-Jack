public class Player {
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public String name;

    public Player(){
        cardTotal = 0;
        isBust = false;
        isHit = true;
        name = "me";
        hand = new Card[2];
    }
    public void printInfo(){
        System.out.println("Hello " + name + " you have " + cardTotal + " total cards and " + hand + " cards in the deck");
        for (int x = 0; x < hand.length; x++) {
            hand[x].printInfo();
        }
    }

    public void hit(){

    }
    public void stand(){

    }
}
