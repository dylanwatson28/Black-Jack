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
        for (int x = 0; x < 2; x++){
            hand[x].printInfo();
        }
    }

    public void hit(){

    }
    public void stand(){

    }
}
