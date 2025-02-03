package Chapter6.Question7;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private int totalCardNum = 0;
    private CardCompany(){}

    public static CardCompany getInstance(){
        if(instance == null){
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard(){
       totalCardNum++;
       return new Card();
    }

    public int getTotalCardNum(){
        return totalCardNum;
    }
}
