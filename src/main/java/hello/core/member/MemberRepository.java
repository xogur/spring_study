package hello.core.member;

//MemberRepository를 구현하는 구현체는 아래 save와 findById를 필수적으로 오버라이드 해야한다. (재정의)
public interface MemberRepository {

    // void는 반환값 없음
    // save는 저장하다
    // member객체를 받아서 저장
    void save(Member member);

    // memberId를 받아서 Member의 findById를 실행
    Member findById(Long memberId);
}
