package hello.core.discount;

import hello.core.member.Member;

// 해당 인터페이스를 구현하는 구현체는 discount함수를 재정의 해야함
public interface DiscountPolicy {
    int discount(Member member, int price);
}
