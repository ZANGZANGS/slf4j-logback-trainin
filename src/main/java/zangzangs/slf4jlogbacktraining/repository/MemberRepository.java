package zangzangs.slf4jlogbacktraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zangzangs.slf4jlogbacktraining.domain.Member;
import zangzangs.slf4jlogbacktraining.domain.Team;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByName(String name);
}
