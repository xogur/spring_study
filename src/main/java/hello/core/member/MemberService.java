package hello.core.member;

// MemberService는 회원가입 기능과 회원 조회 기능
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}

