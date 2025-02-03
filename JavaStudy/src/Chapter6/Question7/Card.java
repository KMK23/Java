package Chapter6.Question7;

public class Card {
    private int userCardNumber;
    private static int cardNumber = 1000;


    public Card(){
        cardNumber++;
        userCardNumber = cardNumber;
    }

    public int getCardNumber(){
        return userCardNumber;
    }
}
