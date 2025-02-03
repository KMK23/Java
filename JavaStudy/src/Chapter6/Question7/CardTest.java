package Chapter6.Question7;

public class CardTest {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance();

        Card kimCard = company.createCard();
        Card leeCard = company.createCard();
        Card parkCard = company.createCard();

        System.out.println("김씨의 카드 번호: " + kimCard.getCardNumber());
        System.out.println("이씨의 카드 번호: " + leeCard.getCardNumber());
        System.out.println("박씨의 카드 번호: " + parkCard.getCardNumber());

        // 4️⃣ 총 발급된 카드 개수 출력
        System.out.println("총 발급된 카드 개수: " + company.getTotalCardNum());
    }
}
