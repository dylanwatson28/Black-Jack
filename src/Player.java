public class Player {
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public String name;
    public int cardCount = 0;
    public int total;

    public Player(){
        cardTotal = 2;
        isBust = false;
        isHit = true;
        name = "me";
        hand = new Card[2];
    }
    public void printInfo(){
        System.out.println("Hello you have " + cardTotal + " total cards in the deck");
        for (int x = 0; x < hand.length; x++) {
            hand[x].printInfo();
        }
    }

    public void hit(Card p){
        public void hit(Card p){

            hand[cardCount] = p;
            cardCount++;
        }

    }
    public void stand(){
        printInfo();



    }

    public void calculateTotal() {
        cardTotal = 0;
        for (int f = 0; f < hand.length; f++){
            cardTotal += hand[f].value;
        }
    }
}
