package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

// 해당 클래스는 DiscountPolicy 인터페이스를 구현함
public class FixDiscountPolicy implements DiscountPolicy{

    // 고정된 할인 가격
    private int discountFixAmount = 1000; //1000원 할인

    @Override
    // DiscountPolicy 인터페이스의 discount함수 재정의
    public int discount(Member member, int price) {
        // 만약 회원의 등급을 조회해서 VIP면 할인되는 가격읜 1000원
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            // VIP등급이 아니라면 할인금액은 0원
            return 0;
        }

    }
}
