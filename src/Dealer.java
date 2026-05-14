public class Dealer {
    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;

    public Dealer(){
        isOver15 = false;
        cardTotal = 0;
        isBust = false;
        hand = new Card[2];

    }
    public void printInfo(){
        System.out.println(" The dealer has " + cardTotal + " total cards and " + hand + " cards in the deck");
    }

    public void hit(){

    }
    public void stand(){

    }
}
