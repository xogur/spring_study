package hello.core.member;

public class Member {

    // private는 해당 클래스 에서만 사용하는 값 id, name, grade선언
    private Long id;
    private String name;
    private Grade grade;

    // 생성자
    // 예를들어 Member member = new Member(1, 권태혁, Grade.VIP)하면
    // 각각 값을 삽입
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // geter는 해당 값을 조회할때 사용 ex) member.getId()
    // seter는 해당 값을 변경할때 사용
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
