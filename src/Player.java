public class Player {
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] hand;
    public String name;

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
        p.printInfo();
        Card[] spencer = hand;
        hand = new Card[3];
        if (isHit == true){
            hand[2] = p;
            hand[0] = spencer[0];
            hand[1] = spencer[1];


            for (int x = 0; x < hand.length; x++){
                cardTotal += hand[x].value;

            }
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
