package zangzangs.slf4jlogbacktraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zangzangs.slf4jlogbacktraining.domain.Team;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    Optional<Team> findByName(String name);
}
