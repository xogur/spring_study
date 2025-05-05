package hello.core.order;

// 해당 인터페이스를 구현하는 구현체는 Order타입의 createOrder함수를 재정의 해야 함
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
