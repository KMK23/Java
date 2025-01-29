package chapter5.Question10;

public class ShoppingTest {
    public static void main(String[] args) {
        Shopping shoppingOrder = new Shopping(
                20240731,
                "abc123",
                "2024년 7월 31일",
                "홍길순",
                "PD0345-12",
                "서울시 영등포구 여의도동 20번지"
        );

        String orderInfo;
        orderInfo = String.format(
                "주문 번호: %d\n주문자 아이디: %s\n주문 날짜: %s\n주문자 이름: %s\n주문 상품 번호: %s\n배송 주소: %s",
                shoppingOrder.getOrderNum(), shoppingOrder.getCustomerID(), shoppingOrder.getBuyDate(),
                shoppingOrder.getCustomerName(), shoppingOrder.getProductNum(), shoppingOrder.getAddr()
        );

        System.out.println(orderInfo);
    }
}
