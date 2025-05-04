package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // MemberRepository의 기능들을 구현한 MemoryMemberRepository객체를 생성하는 memberRepository
    // MemberRepository는 그냥 객체 타입을 선언
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 구현체로서 인터페이스에 있는 기능들 재정의
    // 회원가입 재정의
    @Override
    public void join(Member member) {
        // MemoryMemberRepository인 memberRepository에 회원 정보 저장
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        // memberId를 이용해 회원 조회
        return memberRepository.findById(memberId);
    }
}
