public class Dealer {
    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;
    public int total;

    public Dealer(){
        isOver15 = false;
        cardTotal = 1;
        isBust = false;
        hand = new Card[2];

    }
    public void printInfo(){
        System.out.println(" The dealer has " + cardTotal + " total cards in the deck");
        for (int x = 0; x < hand.length; x++) {
            hand[x].printInfo();
        }
    }
    public void calculateTotal() {
        cardTotal = 0;
        for (int f = 0; f < hand.length; f++){
            cardTotal += hand[f].value;
        }
    }
    public void hit(){



    }
    public void stand(){

    }
}
