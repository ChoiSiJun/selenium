package forjun.selenium.domain.selenium.repo;

import forjun.selenium.domain.selenium.entity.SeleniumConnectionEntity;
import forjun.selenium.domain.selenium.entity.SeleniumConnectionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeleniumConnectionRepository extends JpaRepository<SeleniumConnectionEntity , SeleniumConnectionId>{

    SeleniumConnectionEntity findByConnectionId(SeleniumConnectionId id);
}
