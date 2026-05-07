public class Card {
    public String suit;
    public int value;
    public String name;

    public Card(String psuit, int pvalue, int pname){
        value = pvalue;
       // name = pname;
        suit = psuit;
        if (pname == 0){
            name = "Ace";
            value = 11;
        }
        else if (pname == 1){
            name = "2";
            value = 2;
        }
    }
    public void printInfo(){
        System.out.println("the " + name + " of " + suit + " has a value of " + value + " points");
    }
}
