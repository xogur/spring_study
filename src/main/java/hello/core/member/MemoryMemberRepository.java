package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    // static은 해당 모든 객체들이 같은 메모리 공간을 공유함.
    // 예를들어 member1객체에 권태혁 이라는 이름을 넣으면
    // member2객체에서도 권태혁 이라는 이름을 조회 가능
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        // store에 삽입 (삽입하려는 회원의 회원 넘버, 회원 정보)
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        // store객체는 hashmap타입이기 때문에 키값인 회원id를 이용해 회원 정보를 조회
        return store.get(memberId);
    }
}
