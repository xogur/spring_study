package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

// OrderServiceImpl은 OrderService인터페이스를 구현함
public class OrderServiceImpl implements OrderService {

    // MemberRepository타입의 MemoryMemberRepository객체를 생성
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // DiscountPolicy타입의 FixDiscountPolicy객체를 생성
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    // 인터페이스에 있던 함수를 재정의
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        // 회원 조회
        Member member = memberRepository.findById(memberId);
        // 할인 가격은 discountPolicy객체의 discount함수를 호출
        // 위에서 조회한 멤버 객체를 파라미터로, 상품 가격도 같이
        int discountPrice = discountPolicy.discount(member,itemPrice);

        // Order에 해당 파라미터 값들을 넣은 객체를 반환
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
