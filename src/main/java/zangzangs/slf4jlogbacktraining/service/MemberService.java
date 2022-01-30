package zangzangs.slf4jlogbacktraining.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zangzangs.slf4jlogbacktraining.domain.Member;
import zangzangs.slf4jlogbacktraining.dto.MemberRequest;
import zangzangs.slf4jlogbacktraining.repository.MemberRepository;

@Service
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void save(MemberRequest memberRequest) {
        Member member = memberRequest.toEntity();
        memberRepository.save(member);
    }
}
