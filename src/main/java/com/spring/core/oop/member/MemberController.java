package com.spring.core.oop.member;

//책임: 적당한 회원 저장소에 저장 및 조회 명령을 내려야 한다.
public class MemberController {

    private MemberRepository memberRepository; // 얘한테 명령 내리려고 부품으로 데리고 있음. (composition)
    //(ctrl shift t)

    public MemberController(MemberRepository memberRepository) {
//        memberRepository = new MemoryMemberRepository(); //기존에 메모리에 저장하다가, 정책이 바뀜. DB에 저장하는거로.
//        memberRepository = new DataBaseMemberRepository();
        //클라이언트 MemberController가 서버 memberRepository, DataBaseMemberRepository에 관여o -> OCP원칙에 위배.
        //이게 왜 문제? ~> +order 패키지
        //해결 ->
        this.memberRepository = memberRepository;
    }

    //회원 가입 명령 기능
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원 조회 명령 기능
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }











}
